name := "Augorama"

fork := true
javaOptions in test ++= Seq(
  "-Xms512M", "-Xmx2048M",
  "-XX:MaxPermSize=2048M",
  "-XX:+CMSClassUnloadingEnabled"
)

parallelExecution in test := false

version := "1.0"

scalaVersion := "2.12.8"
val akkaVersion = "2.5.23"
val akkaHttpVersion = "10.1.9"

libraryDependencies ++=
  Seq(
    "ch.megard" %% "akka-http-cors" % "0.4.1",

    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe" % "config" % "1.3.4",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",

    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,

    "org.json4s" %% "json4s-native" % "3.6.7",
    "com.github.nscala-time" %% "nscala-time" % "2.22.0",

    "org.scalatest" %% "scalatest" % "3.0.8" % "test"
  )

dependencyOverrides ++= Seq(
  "com.typesafe.akka" %% "akka-actor"  % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion
)

mainClass in assembly := Some("navicore.augorama.Main")
assemblyJarName in assembly := "Augorama.jar"

