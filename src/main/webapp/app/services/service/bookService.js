(function() {
	var BookService = function() {
	var books = [ {
		'Author' : 'James Herbert',
		'Title' : 'Rats', 'Genre' : 'Horror',
		'Published' : '1988' }, {}];
	this.getBooks = function() {
		return books;
	};
};
angular.module('bookStore').service(
		'bookService', [ BookService ]);
}());
