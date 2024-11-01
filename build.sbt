ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild/scalaVersion:="3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "perfect"
  )
libraryDependencies ++=Seq( "org.apache.spark" %% "spark-core-2.11" % "2.0.2","org.scalatest" %% "scalatest" % "3.3.1" )
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.23" // Or use the latest version
