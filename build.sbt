// === project info ===

inThisBuild(
  Seq(
    organization := "io.github.stoneream",
    homepage := Some(url("https://PROJECT-URL-HERE")),
    licenses := List("LICENSE NAME HERE" -> url("https://LICENSE-URL-HERE")),
    developers := List(
      Developer(
        "stoneream",
        "Ishikawa Ryuto",
        "ishikawa-r@protonmail.com",
        url("https://github.com/stoneream")
      )
    )
  )
)

// === scala settings ===

inThisBuild(
  Seq(
    scalaVersion := "3.4.2",
    scalafmtOnCompile := true,
    scalacOptions ++= Seq(
      "-Yretain-trees",
      "-Wunused:all"
    ),
    semanticdbEnabled := true
  )
)

// === project setting ===

lazy val root = (project in file("."))
  .settings(
    name := "scala-template",
    publish / skip := true
  )

/* example
lazy val core = (project in file("core"))
  .settings(name := "core")

lazy val example = (project in file("example"))
  .settings(name := "example")
  .dependsOn(core)
 */
