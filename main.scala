import scala.io.StdIn.readLine
import scala.util.control.BreakControl
/**
  * List works 
  *
  */
def findElement(listNumbers: List[Int], value: Int): Option[Int] = listNumbers.find(_ == value)
def multiplyElement(listNumbers: List[Int], value: Int): List[Int] = listNumbers.map(_ * value)

def printElementWithFor(list: List[?]) = 
    for i <- list
    do
        println(i)

def printElementForEach(list: List[?]): Unit = list.foreach(println)

/**
  * Calulator
  */
def sumElements(x: Int, y: Int): Int = x + y
def restElements(x: Int, y: Int): Int = x - y
def divideElement(x: Int, y: Int): Int = if (y == 0) then -1 else x / y
def multiplyElement(x: Int, y: Int): Int = x * y

def requestElements() = 
    println("Writing x value: ")
    val x = readLine().toInt
    println("Writing y value: ")
    val y = readLine().toInt
    //Cal operations

@main def main(): Unit = 
    val listNumbers = List('a', 'b', 'c', 'd', 'e')
    printElementForEach(listNumbers)
