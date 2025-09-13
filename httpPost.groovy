@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.JSON

def client = new RESTClient("https://jsonplaceholder.typicode.com/")
def response = client.post(
    path: "posts",
    body: [title: "Groovy Post", body: "Hello API", userId: 1],
    requestContentType: JSON
)

println "Status: ${response.status}"
println "Response: ${response.data}"
