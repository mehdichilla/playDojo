
name := "playframeworkdojo"

version := "0.0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  javaWs,
  jdbc,
  "org.postgresql" % "postgresql" % "9.4.1209"
)

      