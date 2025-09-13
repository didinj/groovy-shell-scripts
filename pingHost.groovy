def host = args ? args[0] : "google.com"
def process = ["ping", "-c", "3", host].execute()
process.in.eachLine { println it }
