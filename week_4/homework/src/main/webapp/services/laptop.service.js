function OderService($http) {
    this.getLaptops = () => {
        return $http.get(BASE_URL + '/laptops/');
    }
}

angular.module('app').service('LaptopService', OderService);