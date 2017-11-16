function OverviewController($scope) {
    let ctrl = this;

    ctrl.totalPrice = 0;

    ctrl.$onChanges = function(changesObj) {
        stateChangeWatcher(changesObj, "overview", OverviewState);

        if (changesObj.state && changesObj.state.currentValue === OverviewState) {
            ctrl.totalPrice = ctrl.laptop.base_price;
            ctrl.laptop.options.forEach(function(option) {
                if (option.selected !== null) {
                    ctrl.totalPrice += option.selected.price;
                }
            }, this);
        }
    };

    ctrl.confirm = function() {
        // ctrl.changeState({ state: PersonalState });
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
