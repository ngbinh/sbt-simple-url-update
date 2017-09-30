
sbtPlugin := true

organization := "org.github.ngbinh"

name := "sbt-simple-url-update"

version := "1.0.2"

scalaVersion := "2.10.6"

resolvers += Classpaths.sbtPluginSnapshots

bintrayOrganization in bintray := None

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.3")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

publishMavenStyle := false

scriptedSettings

scriptedLaunchOpts += ("-Dproject.version=" + version.value)
