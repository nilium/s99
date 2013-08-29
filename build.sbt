import sbt._
import Keys._

scalaVersion := "2.10.2"

scalacOptions in Compile += "-feature"

scalacOptions in Compile += "-deprecation"

scalacOptions in Compile += "-unchecked"

resolvers in ThisBuild ++= Seq(
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
    "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases/")

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
