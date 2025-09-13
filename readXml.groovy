def xmlText = '''
<project>
  <name>Demo App</name>
  <version>1.0.0</version>
  <dependencies>
    <dependency>Groovy</dependency>
    <dependency>Spring Boot</dependency>
  </dependencies>
</project>
'''

def project = new XmlSlurper().parseText(xmlText)

println "Project: ${project.name}"
println "Version: ${project.version}"
println "Dependencies: ${project.dependencies.dependency*.text().join(', ')}"
