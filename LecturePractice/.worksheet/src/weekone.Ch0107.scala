package weekone
import scala.annotation.tailrec

object Ch0107 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  println("Welcome to the Scala worksheet");$skip(142); 
  def factorial(n:Int) = {
  @tailrec
  	def loop (acc: Int, n: Int): Int=
  		if(n==0) acc
  		else loop (acc*n, n-1)
  		loop (1, n)
  
  };System.out.println("""factorial: (n: Int)Int""")}
}
