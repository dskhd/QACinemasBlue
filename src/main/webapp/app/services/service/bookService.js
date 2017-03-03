(function() {
	var BookService = function() {
		var books = [ {
			'Author' : 'James Herbert',
			'Title' : 'Rats', 
			'Genre' : 'Horror',
			'Published' : '1988' 
		}, 
		{
			'Author' : 'Rhold Dahl',
			'Title' : 'James and the Giant Peach',
			'Genre' : 'Horror',
			'Published' : '1985'
		}];
	this.getBooks = function() {
		return books;
	};
};
angular.module('bookStore').service('bookService', [ BookService ]);
}());
