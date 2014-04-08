package grails.plugin.openexchangerates

import grails.converters.JSON
import groovyx.net.http.HTTPBuilder

class OpenExchangeRatesService {

    static final String ROOT_URI = 'http://openexchangerates.org/api'
    static transactional = false

    def grailsApplication

    private HTTPBuilder _http

    def currencies() {
        http.get(path: '/currencies.json', query: [app_id: config.appId]) as JSON
    }

    def latest(Map properties = [:]) {
        http.get(path: '/latest.json', query: [app_id: config.appId] + properties)
    }

    // PRIVATE

    private def getConfig() {
        grailsApplication.config.grails?.plugin?.openexchangerates
    }

    private HTTPBuilder getHttp() {
        if (!_http) _http = new HTTPBuilder(ROOT_URI)
        _http
    }

}
