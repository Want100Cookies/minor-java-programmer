function PickerController() {
    let ctrl = this;

    ctrl.laptops = [
        {
            id: 0,
            name: "Some laptop",
            base_price: 1700,
            options: [
                {
                    catId: 0,
                    message: "Select a screen resolution",
                    selected: null,
                    available: [
                        { id: 1, value: "1080p" },
                        { id: 2, value: "1440p" },
                        { id: 3, value: "2160p" }
                    ]
                },
                {
                    catId: 1,
                    message: "Select the amount of RAM",
                    selected: null,
                    available: [
                        { id: 1, value: "8 GB" },
                        { id: 2, value: "16 GB" },
                        { id: 3, value: "32 GB" }
                    ]
                },
                {
                    catId: 2,
                    message: "Select the processor",
                    selected: null,
                    available: [
                        { id: 1, value: "Intel Core i5 @ 3.0Ghz" },
                        { id: 2, value: "Intel Core i7 @ 3.5Ghz" },
                        { id: 3, value: "Intel Core i7 @ 4.0Ghz" }
                    ]
                }
            ]
        },
        {
            id: 1,
            name: "Another laptop",
            base_price: 900,
            options: [
                {
                    catId: 0,
                    message: "Select a screen resolution",
                    selected: null,
                    available: [
                        { id: 1, value: "1080p" },
                        { id: 2, value: "1440p" },
                        { id: 3, value: "2160p" }
                    ]
                }
            ]
        },
        {
            id: 2,
            name: "Awesome laptop",
            base_price: 9000,
            options: [
                {
                    catId: 1,
                    message: "Select the amount of RAM",
                    selected: null,
                    available: [
                        { id: 1, value: "8 GB" },
                        { id: 2, value: "16 GB" },
                        { id: 3, value: "32 GB" }
                    ]
                }
            ]
        }
    ];

    ctrl.pick = function(laptop) {
        ctrl.onPick({ laptop: laptop });

        ctrl.changeState({state: ConfigureState});
    };

    ctrl.$onChanges = function(changesObj) {
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
