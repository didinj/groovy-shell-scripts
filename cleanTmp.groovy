new File(".").eachFileRecurse { file ->
    if (file.name.endsWith(".tmp")) {
        println "Deleting ${file.path}"
        file.delete()
    }
}
