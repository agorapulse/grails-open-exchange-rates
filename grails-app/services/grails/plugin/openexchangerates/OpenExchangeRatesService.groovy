package grails.plugin.openexchangerates

import grails.plugins.rest.client.RestBuilder

class OpenExchangeRatesService {

    static final String ROOT_URI = 'http://openexchangerates.org/api'

    def grailsApplication

    private RestBuilder rest = new RestBuilder()

    def currencies() {
        def resp = rest.get(ROOT_URI + '/currencies.json')
        resp.json
    }

    def latest(Map properties = [:]) {
        String urlParameters = mapToQueryString([app_id: config.appId] + properties)
        def resp = rest.get(ROOT_URI + "/latest.json?${urlParameters}")
        resp.json
    }

    // PRIVATE

    private def getConfig() {
        grailsApplication.config.grails?.plugin?.openexchangerates
    }

    private String mapToQueryString(Map properties) {
        properties.collect { it }.join('&')
    }

}
