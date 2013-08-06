import com.typesafe.sbt.SbtStartScript

organization := "com.example"

name := "Hello"

version := "0.0.1"

scalaVersion := "2.10.2"

resolvers += "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.2.1",
  "org.scalatra" %% "scalatra-specs2" % "2.2.1" % "test",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "compile",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

seq(SbtStartScript.startScriptForClassesSettings: _*)
