angular
    .module("app", ["ngAnimate"])
    .controller("MainCtrl", function MainCtrl() {
        let ctrl = this;

        ctrl.pickedLaptop = null;
        ctrl.user = null;

        ctrl.state = PickerState;

        ctrl.pickLaptop = laptop => {
            ctrl.pickedLaptop = laptop;
        };

        ctrl.setPersonalInfo = user => {
            ctrl.user = user;
        }

        ctrl.changeState = newState => {
            ctrl.state = newState;
        };
    });

const BASE_URL = "http://server.dev:8000/api";

const PickerState = "PICKER";
const ConfigureState = "CONFIGURE";
const PersonalState = "PERSONAL";
const OverviewState = "OVERVIEW";
const SuccessState = "SUCCESS";

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
