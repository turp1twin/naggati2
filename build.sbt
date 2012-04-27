organization := "com.twitter"

name := "naggati"

version := "3.1.0-SNAPSHOT"

// Our Scala version...
scalaVersion := "2.9.2"

// Axway internal Maven repo
publishTo := Some("ci-synchrony.phx.axway.int-snapshots" at "http://ci-synchrony.phx.axway.int/artifactory/manual-phx-snapshots")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

// App dependencies
libraryDependencies ++= Seq(
    "io.netty" % "netty" % "3.4.1.Final" withSources(),
    "com.twitter" % "util-core_2.9.1" % "1.12.13"
)

//Test dependencies
libraryDependencies ++= Seq(
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test",
  "org.jmock" % "jmock" % "2.5.1" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/",
  "twitter repo" at "http://maven.twttr.com/"
)


