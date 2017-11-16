function PersonalController() {
    let ctrl = this;

    ctrl.user = {};

    ctrl.$onChanges = function(changesObj) {
        stateChangeWatcher(changesObj, "personal", PersonalState);
    };

    ctrl.save = function() {
        ctrl.onNext({ user: ctrl.user });
        ctrl.changeState({ state: OverviewState });
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
