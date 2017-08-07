import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "tech.sourced",
      scalaVersion := "2.12.1",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "siva-java",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += commonsIO % Test
  )
