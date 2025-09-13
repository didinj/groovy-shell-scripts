def command = "ps -ef | grep java | grep -v grep"
def result = command.execute().text
def lines = result.readLines()
println "Java processes running: ${lines.size()}"
