scalaVersion := Dependencies.scalaVersion

val commonSettings = Seq(
  scalaVersion := Dependencies.scalaVersion,
  scalacOptions ++= Seq(
    "-deprecation",
    "-language:implicitConversions",
    "-Xmax-inlines:128",
  ),
  run / fork := true,
  Test / fork := true,
  run / connectInput := true,
)

lazy val common = (project in file("common"))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Dependencies.commonDeps,
  )

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "metals-issue",
  )
  .aggregate(common)
