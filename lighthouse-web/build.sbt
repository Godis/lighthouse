name := "lighthouse"

version := "0.0.2"

scalaVersion := "2.12.4"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += guice

libraryDependencies += "org.webjars" % "bootstrap" % "4.0.0-2"

libraryDependencies += "org.webjars.bower" % "open-iconic" % "1.1.1"

dockerUsername := Some("godis")

dockerBaseImage := "openjdk:8-jre-slim"
