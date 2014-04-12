import AssemblyKeys._

assemblySettings

name := "$name$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)

scalacOptions += "-feature"

scalacOptions += "-deprecation"

scalacOptions in Test += "-language:reflectiveCalls"