package org.neolin.sbt

import sbt._

package object urlupdate {

  /**
    * PathFinder's .*** method is renamed to .allPaths method in sbt 1.0
    */
  implicit class fileShim(val file: File) extends AnyVal {
    def allPaths = file.***
  }
}
