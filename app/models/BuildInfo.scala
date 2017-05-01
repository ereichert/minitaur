package models

import com.typesafe.config.ConfigFactory

object BuildInfo {
  private val config = ConfigFactory.parseResources(BuildInfo.getClass.getClassLoader, "BUILDINFOPROPERTIES")

  lazy val timestamp = config.getString("timestamp")
  lazy val revision = config.getString("revision")
  lazy val branch = config.getString("branch")
  lazy val commitSummary = config.getString("commit_summary")
}