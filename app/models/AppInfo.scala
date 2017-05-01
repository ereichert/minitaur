package models

import com.typesafe.config.ConfigFactory

object AppInfo {
  private val config = ConfigFactory.parseResources(AppInfo.getClass.getClassLoader, "APPINFOPROPERTIES")

  lazy val version = config.getString("version")
  lazy val name = config.getString("name")
  lazy val vendor = config.getString("vendor")

  override val toString = s"$name : $version : $vendor"
}
