
function PersonalController() {
    let ctrl = this;

    ctrl.$onChanges = function(changesObj) {
        stateChangeWatcher(changesObj, "personal", PersonalState);
    };
}

angular.module("app").component("personal", {
    templateUrl: "/components/personal.template.html",
    bindings: {
        user: "=",
        state: "="
    },
    controller: PersonalController
});
