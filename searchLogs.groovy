def keyword = args ? args[0] : "ERROR"
new File(".").eachFileMatch(~/.*\.log/) { file ->
    file.eachLine { line ->
        if (line.contains(keyword)) {
            println "${file.name}: $line"
        }
    }
}
