function PickerController() {
    var ctrl = this;

    ctrl.laptops = [
        {
            id: 0,
            name: "Some laptop",
            base_price: 1700
        },
        {
            id: 1,
            name: "Another laptop",
            base_price: 900
        },
        {
            id: 2,
            name: "Awesome laptop",
            base_price: 9000
        }
    ];

    ctrl.pick = function (laptop) {
        console.log("pick", laptop, ctrl);
        ctrl.onPick({"laptop": laptop});
    };
}

angular
.module("app")
.component("picker", {
    templateUrl: '/components/picker.template.html',
    bindings: {
        onPick: "&"
    },
    controller: PickerController
});