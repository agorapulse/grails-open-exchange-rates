Open Exchange Rates Grails Plugin
=================================

# Introduction

The **Open Exchange Rates Plugin** allows you to integrate [Open Exchange Rates](http://https://openexchangerates.org/) in your [Grails](http://grails.org) application.


# Installation

Declare the plugin dependency in the BuildConfig.groovvy file, as shown here:

```groovy
grails.project.dependency.resolution = {
		inherits("global") { }
		log "info"
		repositories {
				//your repositories
		}
		dependencies {
				//your regular dependencies
		}
		plugins {
				//here go your plugin dependencies
				runtime ':open-exchange-rates:0.1'
		}
}
```


# Config

Create an account on [Open Exchange Rates](http://https://openexchangerates.org/), in order to get your own app ID.

Add your app parameters to your _grails-app/conf/Config.groovy_:

```groovy
grails.plugin.openexchangerates.appId = {APP_ID}
```


# Usage

You can inject _openExchangeRatesService_ in any of your Grails artefacts (controllers, services...) in order to call [Open Exchange Rates APIs](https://openexchangerates.org/documentation).

```groovy
def openExchangeRatesService

// Get latest rates
def result = segmentioService.latest()
println new Date(result.timestamp)
println result.rates['EUR']

// By default (free account), it will use USD as base currency but you can use other currency
result = segmentioService.latest(base: 'EUR')

// Get full currency names
def currencies = segmentioService.currencies()
```

Latest rates are returned with the following format

```json
{
    "disclaimer": "Exchange rates provided by [...]",
    "license": "Data collected and blended [...]",
    "timestamp": 1319730758,
    "base": "USD",
    "rates": {
        "AED": 3.672626,
        "AFN": 48.3775,
        "ALL": 110.223333,
        "AMD": 409.604993,
        /* 160 fx rates available - see currencies.json */
        "YER": 215.035559,
        "ZAR": 8.416205,
        "ZMK": 4954.411262,
        "ZWL": 322.355011
    }
}
```

Check [Open Exchange Rates documentation](https://openexchangerates.org/documentation) for more info.


# Latest releases

* 2014-04-08 **V0.1** : Initial release


# Bugs

To report any bug, please use the project [Issues](http://github.com/benorama/grails-open-exchange-rates/issues) section on GitHub.
