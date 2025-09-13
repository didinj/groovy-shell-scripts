import groovy.json.JsonSlurper

def jsonText = '''
{
  "name": "Alice",
  "role": "Developer",
  "skills": ["Groovy", "Java", "Spring Boot"]
}
'''

def slurper = new JsonSlurper()
def data = slurper.parseText(jsonText)

println "Name: ${data.name}"
println "Role: ${data.role}"
println "Skills: ${data.skills.join(', ')}"
