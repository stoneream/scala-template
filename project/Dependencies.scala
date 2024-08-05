import sbt._

object Dependencies {

  object Versions {
    val logback = "1.5.6"
    val typesafeConfig = "1.4.3"
    val scopt = "4.1.0"
    val circe = "0.14.9"
    val circeOptics = "0.15.0"
    val betterFiles = "3.9.2"
    val scalatest = "3.2.18"
  }

  // logging
  lazy val logback: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % Versions.logback
  )

  // config
  lazy val typesafeConfig: Seq[ModuleID] = Seq(
    "com.typesafe" % "config" % Versions.typesafeConfig
  )

  lazy val scopt: Seq[ModuleID] = Seq(
    "com.github.scopt" %% "scopt" % Versions.scopt
  )

  // json
  lazy val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core" % Versions.circe,
    "io.circe" %% "circe-generic" % Versions.circe,
    "io.circe" %% "circe-parser" % Versions.circe,
    "io.circe" %% "circe-optics" % Versions.circeOptics
  )

  // utility
  lazy val betterFiles: Seq[ModuleID] = Seq(
    "com.github.pathikrit" %% "better-files" % Versions.betterFiles
  )

  // testing
  lazy val scalatest: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % Versions.scalatest % Test
  )
}
