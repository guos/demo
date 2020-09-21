var app = angular.module('demo', []);


app.controller('personCtrl', function($scope, $http) {
	$scope.queryPerson = function() {
		console.dir("query person....");
		$http.get("/person").then(
				function(response) {
					console.dir(response.data);
					$scope.allPerson = response.data;
				});
	};
	$scope.queryPerson();
});