function OverviewController($scope) {
    let ctrl = this;

    ctrl.totalPrice = 0;

    ctrl.$onChanges = changesObj => {
        stateChangeWatcher(changesObj, "overview", OverviewState);

        // On show of this component, calcluate totalPrice
        if (
            changesObj.state &&
            changesObj.state.currentValue === OverviewState
        ) {
            ctrl.totalPrice = ctrl.laptop.base_price;
            ctrl.laptop.options.forEach(option => {
                if (option.selected !== null) {
                    ctrl.totalPrice += option.selected.price;
                }
            });
        }
    };

    ctrl.goTo = location => {
        switch (location) {
            case "picker":
                location = PickerState;
                break;

            case "configuration":
                location = ConfigureState;
                break;

            case "personal":
                location = PersonalState;
                break;

            default:
                alert("Hold on boi...");
                return false;
                break;
        }

        ctrl.changeState({ state: location });
    };

    ctrl.confirm = () => {
        // Todo: send order to back-end

        ctrl.changeState({ state: SuccessState });
    };
}

angular.module("app").component("overview", {
    templateUrl: "/components/overview.template.html",
    bindings: {
        laptop: "<",
        user: "<",
        state: "<",
        changeState: "&"
    },
    controller: OverviewController
});
