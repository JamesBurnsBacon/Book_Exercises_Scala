val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ch15",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    scalacOptions ++= Seq(
      "-deprecation",
    ),

    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "org.eclipse" % "yasson" % "2.0.4",
    )
  )
