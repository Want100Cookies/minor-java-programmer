function OderService($http) {
    this.getLaptops = () => {
        return $http.get(BASE_URL + '/laptops/available');
    }
}

angular.module('app').service('LaptopService', OderService);