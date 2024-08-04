ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "0.0.0"

val chiselVersion = "5.1.0"
val chiselTestVersion = "5.0.2"

lazy val root = (project in file("."))
  .settings(
    name := "blink",
    libraryDependencies ++= Seq(
      "org.chipsalliance" %% "chisel" % chiselVersion,
      "edu.berkeley.cs" %% "chiseltest" % chiselTestVersion % "test"
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      // "-Xfatal-warnings",
      "-language:reflectiveCalls",
      // "-Xcheckinit",
      "-Ymacro-annotations",
    ),
    addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full),
  )



