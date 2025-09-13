import groovy.json.JsonSlurper

def url = "https://jsonplaceholder.typicode.com/users/1"
def response = new URL(url).text
def json = new JsonSlurper().parseText(response)

println "Name: ${json.name}"
println "Email: ${json.email}"
println "Company: ${json.company.name}"
