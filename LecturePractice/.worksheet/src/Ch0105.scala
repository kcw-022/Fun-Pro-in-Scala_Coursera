object Ch0105 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(128); 
  
  def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(71); 
  
  def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(85); 
  
  def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x)/x < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(54); 
  
  def abs(num:Double) = if (num < 0) -num else num;System.out.println("""abs: (num: Double)Double""");$skip(41); 
  
  def sqrt(x:Double) =sqrtIter(1.0,x);System.out.println("""sqrt: (x: Double)Double""");$skip(15); val res$0 = 
  
  sqrt(100);System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 
  sqrt(1e-6);System.out.println("""res1: Double = """ + $show(res$1));$skip(15); 
  
  var y = 8;System.out.println("""y  : Int = """ + $show(y ));$skip(21); 
  def q(t:Int) = y+t;System.out.println("""q: (t: Int)Int""");$skip(17); 
  println (q(4));$skip(11); val res$2 = 
   4*
   8;System.out.println("""res2: Int(32) = """ + $show(res$2))}
   
}
