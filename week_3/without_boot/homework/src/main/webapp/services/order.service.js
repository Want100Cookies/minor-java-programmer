function OderService($http) {
    this.makeOrder = orderObj => {
        return $http.post(BASE_URL + '/orders/', orderObj);
    }
}

angular.module('app').service('OrderService', OderService);