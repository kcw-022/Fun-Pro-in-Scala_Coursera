package weektwo

object weektwo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(103); 
  
  def product(f: Int => Int)(a:Int, b:Int): Int =
  	if (a>b)  1
  	else f (a) * product (f)(a+1,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(31); val res$0 = 
  	
  	product(x=>x * x) (2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(48); 
  	
  	def fact(n: Int) = product(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(15); val res$1 = 
  	
  	fact(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  	fact(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
  	fact(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(153); 
  
  
  def increment(g: (Int,Int) => Int, base: Int)(f:Int => Int)(a:Int, b: Int): Int =
  if (a > b) base
  else g(f(a), increment(g, base)(f)(a+1,b));System.out.println("""increment: (g: (Int, Int) => Int, base: Int)(f: Int => Int)(a: Int, b: Int)Int""");$skip(42); val res$4 = 
  
  increment((x,y)=> x*y, 1)(x=>x)(1,3);System.out.println("""res4: Int = """ + $show(res$4))}
}
