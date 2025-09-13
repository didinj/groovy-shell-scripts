def tools = ["java -version", "groovy -v", "git --version", "docker --version"]

tools.each { cmd ->
    try {
        println "Running: $cmd"
        def process = cmd.execute()
        process.in.eachLine { println "  $it" }
    } catch (Exception e) {
        println "  ERROR: ${cmd.split(' ')[0]} not found"
    }
    println ""
}
