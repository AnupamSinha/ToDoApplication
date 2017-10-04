(function(angular) {
	var AppController = function($scope, Item) {
		$scope.newPriority = '';
		$scope.states = [ 'High', 'Low', 'Medium' ];
		Item.query(function(response) {
			$scope.items = response ? response : [];
		});

		$scope.addItem = function(description, priority, completedOn) {
			new Item({
				description : description,
				priority : priority,
				completedOn : completedOn,
				checked : false
			}).$save(function(item) {
				Item.query(function(response) {
					$scope.items = response ? response : [];
				});
				new PNotify({
		            title: "<i class='fa fa-list'></i> &nbsp;&nbsp;ToDo Application",
		            text: 'ToDo Item has been saved successfully '+item.description,
		            animate: {
		                animate: true,
		                in_class: 'bounceInDown',
		                out_class: 'hinge'
		            },
		            styling: 'bootstrap3',
		            type: 'success',
		            icon: null
		        });
			});
			$scope.newItem = "";
			$scope.newPriority = "";
			$scope.newCompletedOn = "";
		};

		$scope.updateItem = function(item) {
			item.$update();
		};
		
		
		$scope.completeTask = function(item) {
			item.$complete(function(item) {
				Item.query(function(response) {
					$scope.items = response ? response : [];
				});
				new PNotify({
		            title: "<i class='fa fa-list'></i> &nbsp;&nbsp;ToDo Application",
		            text: 'ToDo Item has been completed '+item.description,
		            animate: {
		                animate: true,
		                in_class: 'bounceInDown',
		                out_class: 'hinge'
		            },
		            styling: 'bootstrap3',
		            type: 'success',
		            icon: null
		        });
			});
		};
		
		$scope.reset = function() {
			$scope.newPriority = '';
			$scope.newItem = '';
			$scope.newCompletedOn = '';
		};

		$scope.deleteItem = function(item) {
			item.$remove(function() {
				$scope.items.splice($scope.items.indexOf(item), 1);
			});
		};

	};

	AppController.$inject = [ '$scope', 'Item' ];
	angular.module("myApp.controllers").controller("AppController",
			AppController);
}(angular));