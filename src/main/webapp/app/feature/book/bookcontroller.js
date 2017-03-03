(function() {
	var BookControl=function(BookService){
		var vm = this;
		vm.books = []; 
		function init() {
			vm.books = BookService.getBooks();
		}
		init();
	};
	angular.module('bookStore').controller('bookController', ['bookService',BookControl]);
}());