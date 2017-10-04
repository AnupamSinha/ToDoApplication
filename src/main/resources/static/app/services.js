(function(angular) {
	var ItemFactory = function($resource) {
		return $resource('/items/:id', {
			id : '@id'
		}, {
			remove : {
				method : "DELETE"
			},
			complete : {
				method : "PUT"
			}
		});
	};

	ItemFactory.$inject = [ '$resource' ];
	angular.module("myApp.services").factory("Item", ItemFactory);
}(angular));