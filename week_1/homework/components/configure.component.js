function ConfigureController() {
    let ctrl = this;

    ctrl.$onChanges = function(changesObj) {        
        stateChangeWatcher(changesObj, "configure", ConfigureState);
    };

    ctrl.save = function () {
        ctrl.changeState({state: PersonalState});
    }
}

angular.module("app").component("configure", {
    templateUrl: "/components/configure.template.html",
    bindings: {
        laptop: "<",
        state: "<",
        changeState: "&",
    },
    controller: ConfigureController
});
