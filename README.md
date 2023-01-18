Open Exchange Rates Grails Plugin
=================================

[![Build Status](https://travis-ci.org/agorapulse/grails-grails-open-exchange-rates.png)](https://travis-ci.org/agorapulse/grails-segment)
[![Download](https://api.bintray.com/packages/agorapulse/plugins/grails-open-exchange-rates/images/download.svg)](https://bintray.com/agorapulse/plugins/grails-open-exchange-rates/_latestVersion)

# Introduction

IMPORTANT: Project retirement
-------------------------------

**This project is retired.**

The **Open Exchange Rates Plugin** allows you to integrate [Open Exchange Rates](http://https://openexchangerates.org/) in your [Grails](http://grails.org) application.


# Installation

Declare the plugin dependency in the _build.gradle_ file, as shown here:

```groovy
repositories {
    ...
    maven { url "http://dl.bintray.com/agorapulse/grails-open-exchange-rates" }
}
dependencies {
    ...
    compile "org.grails.plugins:grails-open-exchange-rates:1.0"
}
```


# Config

Create an account on [Open Exchange Rates](http://https://openexchangerates.org/), in order to get your own app ID.

Add your app parameters to your _grails-app/conf/application.yml_:

```yml
grails:
    plugin:
        openexchangerates:
            appId: {APP_ID} # Write ID
```


# Usage

You can inject _openExchangeRatesService_ in any of your Grails artefacts (controllers, services...) in order to call [Open Exchange Rates APIs](https://openexchangerates.org/documentation).

```groovy
// Get latest rates
def result = openExchangeRatesService.latest()
println new Date(result.timestamp)
println result.rates['EUR']

// By default (free account), it will use USD as base currency but you can use other currency
result = openExchangeRatesService.latest(base: 'EUR')

// Get full currency names
def currencies = openExchangeRatesService.currencies()
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

* 2014-04-16 **V0.1** : Initial release


# Bugs

To report any bug, please use the project [Issues](http://github.com/agorapulse/grails-open-exchange-rates/issues) section on GitHub.
