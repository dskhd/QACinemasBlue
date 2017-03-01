"use strict";
(function() {
	angular.module('bookStore').config(
			function($stateProvider, $urlRouterProvider) {
				$urlRouterProvider.otherwise("/book");
				$stateProvider.state("book", {
					url : "/book",
					templateUrl : "app/book/book.html"
				}).state("other", {
					url : "/other",
					templateUrl : "app/other/other.html"
				})

			});
}());
