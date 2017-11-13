angular
    .module("app", ["ngAnimate"])
    .controller("MainCtrl", function MainCtrl() {
        let ctrl = this;
        ctrl.pickedLaptop = null;
        ctrl.state = PickerState;

        ctrl.pickLaptop = function(laptop) {
            ctrl.pickedLaptop = laptop;
        };

        ctrl.changeState = function(newState) {
            ctrl.state = newState;
        };
    });

const PickerState = "PICKER";
const ConfigureState = "CONFIGURE";
const PersonalState = "PERSONAL";

function stateChangeWatcher(changesObj, component, state) {
    if (changesObj.state) {
        if (changesObj.state.currentValue === state) {
            jQuery(component + " > .card > .card-body").collapse("show");
        } else if (
            changesObj.state.previousValue === state &&
            changesObj.state.currentValue !== state
        ) {
            jQuery(component + " > .card > .card-body").collapse("hide");
        }
    }
}
