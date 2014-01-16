angular.module('airport', [])
    .directive('airportTypeAhead', function($http){
        return {
            scope: {},
            restrict: 'EA',
            replace: false,
            templateUrl: "js/lib/airportApp/airportTypeahead.html",
            link: function(scope){
                scope.selected = undefined;
                scope.getAirports = function(val) {
                    return $http.get('http://localhost:8080/AirportDemoApp/airport', {params: {term: val}})
                        .then(function(res){
                            var airports = [];
                            angular.forEach(res.data, function(item){
                                airports.push(item.name);
                            });
                            return airports;
                        });
                };

                scope.states = ['Alabama', 'Alaska', 'Arizona', 'Arkansas', 'California', 'Colorado', 'Connecticut',
                                'Delaware', 'Florida', 'Georgia', 'Hawaii', 'Idaho', 'Illinois', 'Indiana', 'Iowa',
                                'Kansas', 'Kentucky', 'Louisiana', 'Maine', 'Maryland', 'Massachusetts', 'Michigan',
                                'Minnesota', 'Mississippi', 'Missouri', 'Montana', 'Nebraska', 'Nevada', 'New Hampshire',
                                'New Jersey', 'New Mexico', 'New York', 'North Dakota', 'North Carolina', 'Ohio', 'Oklahoma',
                                'Oregon', 'Pennsylvania', 'Rhode Island', 'South Carolina', 'South Dakota', 'Tennessee', 'Texas',
                                'Utah', 'Vermont', 'Virginia', 'Washington', 'West Virginia', 'Wisconsin', 'Wyoming'];
            }
        }
    });
