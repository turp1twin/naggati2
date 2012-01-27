organization := "com.twitter"

name := "naggati"

version := "2.3.0-SNAPSHOT"

// Our Scala version...
scalaVersion := "2.9.1"

// App dependencies
libraryDependencies ++= Seq(
    "org.jboss.netty" % "netty" % "3.2.7.Final",
    "com.twitter" %% "util-core" % "1.12.12"
)

//Test dependencies
libraryDependencies ++= Seq(
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test",
  "org.jmock" % "jmock" % "2.5.1" % "test",
  "org.hamcrest" % "hamcrest-all" % "1.1" % "test",
  "cglib" % "cglib" % "2.2.2" % "test",
  "asm" % "asm" % "3.3.1" % "test",
  "org.objenesis" % "objenesis" % "1.2" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/",
  "scala-tools" at "http://nexus.scala-tools.org/content/repositories/releases/",
  "twitter repo" at "http://maven.twttr.com/",
  "freemarker" at "http://freemarker.sourceforge.net/maven2/"
)



