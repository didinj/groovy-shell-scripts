import groovy.json.JsonOutput

def person = [
    name: "Bob",
    role: "DevOps Engineer",
    skills: ["Docker", "Kubernetes", "CI/CD"]
]

def json = JsonOutput.prettyPrint(JsonOutput.toJson(person))
println json
