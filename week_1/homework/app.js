angular
.module("app", [])
.controller("MainCtrl", function MainCtrl() {
    let ctrl = this;

    ctrl.pickLaptop = function (laptop) {
        console.log(laptop);
    };
});