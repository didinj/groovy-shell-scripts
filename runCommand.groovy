def command = "ls -l"
def process = command.execute()
process.in.eachLine { line ->
    println line
}
