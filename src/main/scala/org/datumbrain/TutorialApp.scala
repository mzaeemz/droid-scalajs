package org.datumbrain
import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.HTMLElement

import scala.math._
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp{
  def main(args: Array[String]): Unit = {
    println("Hello World")
    val robot = document.getElementById("android")
    val head = document.getElementById("head")
    val torso = document.getElementById("torso")

    head.addEventListener("click", { (e: dom.MouseEvent) =>
      changeEyesColor()
    })
    torso.addEventListener("click", { (e: dom.MouseEvent) =>
      println("here")
      changeArmsColor()
    })
  }
  @JSExportTopLevel("changeEyesColor")
  def changeEyesColor() = {
    document.getElementById("left_eye").asInstanceOf[HTMLElement].classList.toggle("red_eye")
    document.getElementById("right_eye").asInstanceOf[HTMLElement].classList.toggle("red_eye")
  }
  @JSExportTopLevel("changeArmsColor")
  def changeArmsColor() = {
    document.getElementById("left_arm").asInstanceOf[HTMLElement].classList.toggle("red_arm")
    document.getElementById("right_arm").asInstanceOf[HTMLElement].classList.toggle("red_arm")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit ={
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

}
