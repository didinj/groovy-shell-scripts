def logFile = new File("app.log")
def lastSize = 0

while (true) {
    if (logFile.length() > lastSize) {
        logFile.withReader { reader ->
            reader.skip(lastSize)
            reader.eachLine { line ->
                if (line.contains("ERROR")) {
                    println "[!] ${line}"
                }
            }
        }
        lastSize = logFile.length()
    }
    sleep(1000)
}
