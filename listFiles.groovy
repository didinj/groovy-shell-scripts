def dir = new File(".")
dir.eachFile { file ->
    println "${file.name} - ${file.length()} bytes"
}
