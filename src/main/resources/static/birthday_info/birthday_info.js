angular.module('crm-front').controller('birthdayController', function ($scope, $http) {
    const contextPath = 'http://localhost:8190/crm/';

    $scope.loadCustomers = function () {
            $http ({
                url: contextPath + 'api/v1/customers/1/1',
                method: 'GET',
            }).then(function (response) {
               // console.log(response);
                $scope.customers = response.data;
            });
        };

    $scope.loadCustomers();
});