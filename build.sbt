enablePlugins(ScalaJSPlugin)

name := "droid-scalajs"

version := "0.1"

scalaVersion := "2.13.3"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
