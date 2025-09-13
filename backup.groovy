def dir = "logs"
def archive = "logs_backup.tar.gz"
["tar", "-czf", archive, dir].execute().waitFor()
def backupDir = new File("backup")
if (!backupDir.exists()) backupDir.mkdirs()
new File(archive).renameTo(new File(backupDir, archive))
println "Backup created at backup/${archive}"
