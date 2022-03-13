package io.sdkman.changelogs

import com.github.mongobee.changeset.{ChangeLog, ChangeSet}
import com.mongodb.client.MongoDatabase

@ChangeLog(order = "013")
class MavenMigration {
  @ChangeSet(order = "009", id = "009-add_maven_3.8.5", author = "aalmiray")
  def migration008(implicit db: MongoDatabase): Unit = {
    Version(
      "maven",
      "3.8.5",
      "https://archive.apache.org/dist/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.zip"
    ).validate()
      .insert()
      .asCandidateDefault()
  }
}
