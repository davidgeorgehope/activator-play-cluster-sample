package meta

import java.io.File
import java.net.URL

/** This object was generated by sbt-buildinfo. */
case object BuildInfo {
  /** The value is "cluster-play-frontend". */
  val name: String = "cluster-play-frontend"
  /** The value is "2.4.20". */
  val version: String = "2.4.20"
  /** The value is "2.11.11". */
  val scalaVersion: String = "2.11.11"
  /** The value is "1.0.0". */
  val sbtNativePackager: String = "1.0.0"
  override val toString: String = "name: %s, version: %s, scalaVersion: %s, sbtNativePackager: %s" format (name, version, scalaVersion, sbtNativePackager)
  val toMap: Map[String, Any] = Map[String, Any](
    "name" -> name,
    "version" -> version,
    "scalaVersion" -> scalaVersion,
    "sbtNativePackager" -> sbtNativePackager)

  val toJson: String = toMap.map(i => "\"" + i._1 + "\":\"" + i._2 + "\"").mkString("{", ", ", "}")
}