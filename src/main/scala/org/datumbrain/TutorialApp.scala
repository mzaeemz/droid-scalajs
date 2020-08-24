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
    //The Whole Robot Node
    val robot = document.getElementById("android")
    //Head of the bot
    val head = document.getElementById("head")
    //torso of bot
    val torso = document.getElementById("torso")

    //Change Eyes Color on clicking on head
    head.addEventListener("click", { (e: dom.MouseEvent) =>
      changeEyesColor()
    })
    //Change Arms Color on clicking on torso
    torso.addEventListener("click", { (e: dom.MouseEvent) =>
      println("here")
      changeArmsColor()
    })
  }
  
  //function to change color of eyes
  @JSExportTopLevel("changeEyesColor")
  def changeEyesColor() = {
    document.getElementById("left_eye").asInstanceOf[HTMLElement].classList.toggle("red_eye")
    document.getElementById("right_eye").asInstanceOf[HTMLElement].classList.toggle("red_eye")
  }

  //function to change color of eyes
  @JSExportTopLevel("changeArmsColor")
  def changeArmsColor() = {
    document.getElementById("left_arm").asInstanceOf[HTMLElement].classList.toggle("red_arm")
    document.getElementById("right_arm").asInstanceOf[HTMLElement].classList.toggle("red_arm")
  }


  /*
  *Function to Append Paragraph within a DOM Element
  *@param targetNode: The node to append Paragraph inside
  *@param text: Text to be included inside Paragraph
  */
  def appendPar(targetNode: dom.Node, text: String): Unit ={
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

}
