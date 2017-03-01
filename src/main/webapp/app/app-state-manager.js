"use strict";
(function() {
	angular.module('bookStore').config(
			function($stateProvider, $urlRouterProvider) {
				$urlRouterProvider.otherwise("/book");
				$stateProvider.state("book", {
					url : "/book",
					templateUrl : "app/feature/book/books.html"
				}).state("other", {
					url : "/other",
					templateUrl : "app/feature/other/other.html"
				})
			});
}());
