
"use strict";
(function() {
	angular.module('QACinema').config(
		function($stateProvider, $urlRouterProvider) {
			$urlRouterProvider.otherwise("/frontpage");
			$stateProvider.state("frontpage", {
				url : "/frontpage",
				templateUrl : "app/feature/frontpage/frontpage.html"
			}).state("screens", {
				url : "/screens",
				templateUrl : "app/feature/ourscreens/ourScreens.html"
			}).state("film", {
				url : "/film",
				templateUrl : "app/feature/film/film.html"
			}).state("aboutus", {
				url : "/about",
				templateUrl : "app/feature/about/about.html"
			})
		});
	
}());