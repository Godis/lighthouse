name := "lighthouse"

version := "0.0.2"

scalaVersion := "2.12.4"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += guice

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

libraryDependencies += "com.h2database" % "h2" % "1.4.196"

dockerUsername := Some("godis")

dockerBaseImage := "openjdk:8-jre-slim"

dockerUpdateLatest := true
