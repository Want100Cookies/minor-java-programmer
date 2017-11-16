function OverviewController($scope) {
    let ctrl = this;

    ctrl.$onChanges = function(changesObj) {
        stateChangeWatcher(changesObj, "configure", ConfigureState);
    };

    ctrl.save = function() {
        if ($scope.configure.$valid) {
            ctrl.changeState({ state: PersonalState });
        }
    };
}

angular.module("app").component("configure", {
    templateUrl: "/components/configure.template.html",
    bindings: {
        laptop: "<",
        state: "<",
        changeState: "&"
    },
    controller: OverviewController
});
