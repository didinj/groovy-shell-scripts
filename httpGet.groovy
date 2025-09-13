def url = "https://jsonplaceholder.typicode.com/posts/1"
def response = new URL(url).text
println response
