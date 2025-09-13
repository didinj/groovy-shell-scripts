def projectName = args ? args[0] : "MyProject"
def baseDir = new File(projectName)

["src", "src/main", "src/test", "docs"].each {
    def dir = new File(baseDir, it)
    if (!dir.exists()) dir.mkdirs()
    println "Created ${dir.path}"
}

new File(baseDir, "README.md").text = "# ${projectName}\n\nProject initialized with Groovy script."
println "Project ${projectName} initialized successfully!"
