name := "$name$"

version := "$version$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.1"
)

scalacOptions += "-feature"

scalacOptions += "-deprecation"

scalacOptions in Test += "-language:reflectiveCalls"