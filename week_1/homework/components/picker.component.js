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
                    name: "Screen resolution",
                    selected: null,
                    available: [
                        { id: 1, value: "1080p", price: 0 },
                        { id: 2, value: "1440p", price: 150 },
                        { id: 3, value: "2160p", price: 250 }
                    ]
                },
                {
                    catId: 1,
                    message: "Select the amount of RAM",
                    name: "RAM",
                    selected: null,
                    available: [
                        { id: 1, value: "8 GB", price: 0 },
                        { id: 2, value: "16 GB", price: 105 },
                        { id: 3, value: "32 GB", price: 220 }
                    ]
                },
                {
                    catId: 2,
                    message: "Select the processor",
                    name: "Processor",
                    selected: null,
                    available: [
                        { id: 1, value: "Intel Core i5 @ 3.0Ghz", price: 0, },
                        { id: 2, value: "Intel Core i7 @ 3.5Ghz", price: 150 },
                        { id: 3, value: "Intel Core i7 @ 4.0Ghz", price: 300 }
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
                    name: "Screen resolution",
                    selected: null,
                    available: [
                        { id: 1, value: "1080p", price: 0 },
                        { id: 2, value: "1440p", price: 150 },
                        { id: 3, value: "2160p", price: 250 }
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
                    name: "RAM",
                    selected: null,
                    available: [
                        { id: 1, value: "8 GB", price: 0 },
                        { id: 2, value: "16 GB", price: 105 },
                        { id: 3, value: "32 GB", price: 220 }
                    ]
                }
            ]
        }
    ];

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
