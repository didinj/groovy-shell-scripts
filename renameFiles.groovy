def today = new Date().format("yyyyMMdd")
new File(".").eachFileMatch(~/.*\.txt/) { file ->
    def newName = "${today}_${file.name}"
    file.renameTo(new File(file.parent, newName))
    println "Renamed ${file.name} -> ${newName}"
}
