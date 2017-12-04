function OverviewController($scope) {
    let ctrl = this;

    ctrl.$onChanges = changesObj => {
        stateChangeWatcher(changesObj, "success", SuccessState);
    };
}

angular.module("app").component("success", {
    templateUrl: "/components/success.template.html",
    bindings: {
        laptop: "<",
        user: "<",
        state: "<",
    },
    controller: OverviewController
});
