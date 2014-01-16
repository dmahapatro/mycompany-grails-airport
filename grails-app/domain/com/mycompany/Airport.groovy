package com.mycompany

import grails.rest.Resource

//@Resource(uri='/airports', formats=['json', 'xml'])
class Airport {

    String id
    String name
    String code

    static mapping = {
        id column: 'id', type: 'string', generator: 'assigned'
    }

    static constraints = {
        id bindable: true
    }
}
