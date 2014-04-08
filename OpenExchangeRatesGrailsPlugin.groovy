class OpenExchangeRatesGrailsPlugin {

    def version = "0.1"
    def grailsVersion = "2.3 > *"
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Benoit Hediard"
    def authorEmail = "ben@benorama.com"
    def title = "Open Exchange Rates Grails Plugin"
    def description = '''Real-time exchange rates & currency conversion JSON API.'''

    def documentation = "http://agorapulse.github.io/grails-open-exchange-rates/guide/"
    def license = "APACHE"
    def organization = [ name: "AgoraPulse", url: "http://www.agorapulse.com/" ]
    def issueManagement = [ system: "github", url: "https://github.com/agorapulse/grails-open-exchange-rates/issues" ]
    def scm = [  url: "https://github.com/agorapulse/grails-open-exchange-rates" ]

}
