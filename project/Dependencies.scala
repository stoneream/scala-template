import sbt._

object Dependencies {

  object Versions {
    val logback = "1.4.7"
    val typesafeConfig = "1.4.2"
  }

  // logging
  val logback: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % Versions.logback
  )

  // config
  val typesafeConfig: Seq[ModuleID] = Seq(
    "com.typesafe" % "config" % Versions.typesafeConfig
  )

  val scalatest: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % Versions.scalatest % Test
  )

  val deps: Seq[ModuleID] = Seq(
    logback,
    typesafeConfig,
    scalatest
  ).flatten

}
