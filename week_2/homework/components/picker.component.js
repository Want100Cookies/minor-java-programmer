function PickerController(LaptopService) {
    let ctrl = this;

    ctrl.laptops = [];

    LaptopService.getLaptops().then(response => {
        ctrl.laptops = response.data;
    });
    

    ctrl.pick = laptop => {
        ctrl.onPick({ laptop: laptop });

        ctrl.changeState({state: ConfigureState});
    };

    ctrl.$onChanges = changesObj => {
        stateChangeWatcher(changesObj, "picker", PickerState);
    };
}

angular.module("app").component("picker", {
    templateUrl: "/components/picker.template.html",
    bindings: {
        onPick: "&",
        state: "<",
        changeState: "&",
    },
    controller: PickerController
});
