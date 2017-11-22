function PersonalController($scope) {
    let ctrl = this;

    ctrl.user = {};

    ctrl.$onChanges = changesObj => {
        stateChangeWatcher(changesObj, "personal", PersonalState);
    };

    ctrl.save = () => {
        if ($scope.personal.$valid) {
            ctrl.onNext({ user: ctrl.user });
            ctrl.changeState({ state: OverviewState });
        }
    };
}

angular.module("app").component("personal", {
    templateUrl: "/components/personal.template.html",
    bindings: {
        state: "<",
        changeState: "&",
        onNext: "&"
    },
    controller: PersonalController
});
