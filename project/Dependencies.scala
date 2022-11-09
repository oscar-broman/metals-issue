import sbt._

object Dependencies {
  val scalaVersion = "3.2.1"

  // Testing
  val junitVersion = "4.13.2"
  val scalaTestVersion = "3.2.14"
  val scalacticVersion = "3.2.14"
  val scalaCheckVersion = "1.16.0"
  val junit = "junit" % "junit" % junitVersion
  val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion
  val scalactic = "org.scalactic" %% "scalactic" % scalacticVersion
  val scalaCheck = "org.scalacheck" %% "scalacheck" % scalaCheckVersion

  // Logging
  val log4jVersion = "2.18.0"
  val slf4jVersion = "1.7.36"
  val log4jCore = "org.apache.logging.log4j" % "log4j-core" % log4jVersion
  val log4jApi = "org.apache.logging.log4j" % "log4j-api" % log4jVersion
  val log4jSlf4jImpl = "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4jVersion
  val slf4j = "org.slf4j" % "slf4j-api" % slf4jVersion

  val testingDeps = Seq(
    scalaTest,
    scalactic,
    scalaCheck,
    junit,
  )

  val loggingDeps = Seq(
    log4jSlf4jImpl,
    log4jCore,
    log4jApi,
    slf4j,
  )

  val commonDeps = loggingDeps ++ testingDeps
}
