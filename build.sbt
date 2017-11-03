
sbtPlugin := true

organization := "org.github.ngbinh"

name := "sbt-simple-url-update"

version := "1.0.4"

crossSbtVersions := Seq("0.13.16", "1.0.3")

addSbtPlugin("com.typesafe.sbt" %% "sbt-web" % "1.4.3")

bintrayOrganization in bintray := None

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

publishMavenStyle := false

scriptedLaunchOpts += ("-Dproject.version=" + version.value)
