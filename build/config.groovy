
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '2.4.0')
        classNode.putNodeMetaData('projectName', 'grails-open-exchange-rates')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
