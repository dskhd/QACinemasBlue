
"use strict";
(function() {
	angular.module('QACinema').config(
		function($stateProvider, $urlRouterProvider) {
			$urlRouterProvider.otherwise("/frontpage");
			$stateProvider.state("/", {
				url : "/frontpage",
				templateUrl : "app/feature/frontpage/frontpage.html"
			}).state("film", {
				url : "/film",
				templateUrl : "app/feature/film/film.html"
			}).state("aboutus", {
				url : "/aboutus",
				templateUrl : "app/feature/aboutus/aboutus.html"
			})
		});
}());