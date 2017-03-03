
"use strict";
(function() {
	angular.module('QACinema').config(
		function($stateProvider, $urlRouterProvider) {
			$urlRouterProvider.otherwise("/frontpage");
			$stateProvider.state("frontpage", {
				url : "/frontpage",
				templateUrl : "app/feature/frontpage/frontpage.html"
			}).state("film", {
				url : "/film",
				templateUrl : "app/feature/book/film/film.html"
			}).state("aboutus", {
				url : "/about",
				templateUrl : "app/feature/about/about.html"
			}).state("classification", {
				url : "/classification",
				templateUrl : "app/feature/classification/classification.html"
			})
		});
}());