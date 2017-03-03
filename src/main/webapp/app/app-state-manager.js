
"use strict";
(function() {
	angular.module('QACinema').config(
		function($stateProvider, $urlRouterProvider) {
			$urlRouterProvider.otherwise("/frontpage");
			$stateProvider.state("frontpage", {
				url : "/frontpage",
				templateUrl : "app/feature/frontpage/frontpage.html"
			}).state("ourScreen", {
				url : "/ourScreen",
				templateUrl : "app/feature/ourscreens/ourScreens.html"
			})
		});
	
}());