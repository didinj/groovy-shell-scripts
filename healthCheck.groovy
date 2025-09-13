import groovy.json.JsonSlurper

def urls = [
    "https://jsonplaceholder.typicode.com/posts/1",
    "https://jsonplaceholder.typicode.com/users/1"
]

urls.each { u ->
    try {
        def response = new URL(u).text
        def json = new JsonSlurper().parseText(response)
        println "[OK] ${u} - Response contains keys: ${json.keySet()}"
    } catch (Exception e) {
        println "[FAIL] ${u} - ${e.message}"
    }
}
