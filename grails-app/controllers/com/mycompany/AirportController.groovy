package com.mycompany

import grails.converters.JSON

class AirportController {
    def index() {
        //A RESTful Web service call to middle tier can be initiated here

        //Mocking the restful call
        render Airport.findAllByNameIlike("%$params.term%") as JSON
    }
}
