import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def xml = new MarkupBuilder(writer)

xml.person {
    name "Charlie"
    role "QA Engineer"
    skills {
        skill "Testing"
        skill "Automation"
        skill "Selenium"
    }
}

println writer.toString()
