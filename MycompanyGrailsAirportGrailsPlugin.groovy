class MycompanyGrailsAirportGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.3 > *"
    def pluginExcludes = []

    // TODO Fill in these fields
    def title = "Airport Domain Full Stack Plugin for my Company"
    def author = "Dhiraj Mahapatro"
    def authorEmail = "dmahapatro@netjets.com"
    def description = '''\
A full stack plugin for Airport domain amalgamated with AngularJS Client side.
This plugin provides the flexibility of leveraging both the server side and client side view implementation.
An app using this plugin can use the services provided by Grails as well as directives Provided by AngularJS
'''

    def documentation = "http://grails.org/plugin/mycompany-grails-airport"
    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]
    def developers = [ [ name: "Dhiraj Mahapatro", email: "dmahapatro@netjets.com" ]]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
