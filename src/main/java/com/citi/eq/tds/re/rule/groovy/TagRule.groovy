package com.citi.eq.tds.re.rule.groovy

import groovy.time.TimeCategory

/**
 * Created by mv29256 on 10/12/2015.
 */

use(TimeCategory) {


    print 10.hour.ago
}

def builder = new groovy.xml.MarkupBuilder()

builder.book {
    name 'Mahesh'
    surname 'Vibhute'
    address {
        street 'Pathardi Road'
        flatno '1'
    }
}

builder.println()

builder.MappingConfig("xmlns:myNamespace": "b") {
    InputConfig {
        GroupField(namespace: "csv") {
            AlphanumericField(name: "input.field", format: "yyyy-MM-dd")
        }
    }

    OutputConfig {
        GroupField(namespace: "csv") {
            AlphanumericField(name: "output.field", format: "yyyy-MM-dd", mapFrom: "input.field")
        }
    }
}

builder.println()