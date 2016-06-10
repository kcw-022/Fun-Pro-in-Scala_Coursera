package weekone
import scala.annotation.tailrec

object Ch0107 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def factorial(n:Int) = {
  @tailrec
  	def loop (acc: Int, n: Int): Int=
  		if(n==0) acc
  		else loop (acc*n, n-1)
  		loop (1, n)
  
  }                                               //> factorial: (n: Int)Int
}