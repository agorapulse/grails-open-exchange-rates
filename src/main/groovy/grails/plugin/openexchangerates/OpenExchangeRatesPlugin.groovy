package grails.plugin.openexchangerates

import grails.plugins.*

class OpenExchangeRatesGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.0.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Open Exchange Rates Grails Plugin"
    def author = "Benoit Hediard"
    def authorEmail = "ben@agorapulse.com"
    def description = '''\
Real-time exchange rates & currency conversion JSON API.
'''
    def profiles = ['web']

    def documentation = "https://github.com/agorapulse/grails-open-exchange-rates"
    def license = "APACHE"
    def organization = [ name: "AgoraPulse", url: "http://www.agorapulse.com/" ]
    def issueManagement = [ system: "github", url: "https://github.com/agorapulse/grails-open-exchange-rates/issues" ]
    def developers = [ [ name: "Florian Ernoult", email: "flo@agorapulse.com" ]]
    def scm = [  url: "https://github.com/agorapulse/grails-open-exchange-rates" ]

}
