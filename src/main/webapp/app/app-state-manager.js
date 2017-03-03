
"use strict";
(function() {
	angular.module('QACinema').config(
		function($stateProvider, $urlRouterProvider) {
			$urlRouterProvider.otherwise("/frontpage");
			$stateProvider.state("frontpage", {
				url : "/frontpage",
				templateUrl : "app/feature/frontpage/frontpage.html"
<<<<<<< HEAD
			}).state("ourScreen", {
				url : "/ourScreen",
				templateUrl : "app/feature/ourscreens/ourScreens.html"
=======
			}).state("film", {
				url : "/film",
				templateUrl : "app/feature/film/film.html"
			}).state("aboutus", {
				url : "/about",
				templateUrl : "app/feature/about/about.html"
>>>>>>> a0d5f1bb68218009ea5d90db303bca69c8892f18
			})
		});
	
}());