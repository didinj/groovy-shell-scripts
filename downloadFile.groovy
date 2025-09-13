def url = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
def file = new File("dummy.pdf")

file.withOutputStream { out ->
    out << new URL(url).openStream()
}

println "Downloaded ${file.name} (${file.length()} bytes)"
