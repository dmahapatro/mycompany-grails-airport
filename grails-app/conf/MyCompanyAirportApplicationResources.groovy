modules = {
    jQuery {
        resource url:"http://code.jquery.com/jquery-1.10.2.js"
    }
    angular {
        resource url:"https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9/angular.min.js"
    }

    bootstrap {
        dependsOn 'jQuery'
        resource url:"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
        resource url:"http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"
    }

    airport {
        dependsOn 'angular, bootstrap'
        resource url:'js/lib/airportApp/ui-bootstrap-tpls-0.10.0.js'
        resource url:'js/lib/airportApp/airportTypeahead.js'
    }
}