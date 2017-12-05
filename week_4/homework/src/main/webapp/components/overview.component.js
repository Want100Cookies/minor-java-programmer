function OverviewController($scope, OrderService) {
    let ctrl = this;

    ctrl.totalPrice = 0;
    ctrl.selectedOptions = [];

    ctrl.$onChanges = changesObj => {
        stateChangeWatcher(changesObj, "overview", OverviewState);

        // On show of this component, calcluate totalPrice
        if (
            changesObj.state &&
            changesObj.state.currentValue === OverviewState
        ) {
            ctrl.totalPrice = ctrl.laptop.basePrice;
            ctrl.laptop.components.forEach(component => {
                if (component.selected !== null) {
                    ctrl.totalPrice += component.selected.price;

                    ctrl.selectedOptions.push(component.selected);
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
       OrderService.makeOrder({
            laptop: ctrl.laptop,
            user: ctrl.user,
            selectedOptions: ctrl.selectedOptions
        }).then(response => {
            ctrl.changeState({ state: SuccessState });
        }, error => {
            alert("Order could not be processed. Please try again later.");
        })
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
