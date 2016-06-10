package weektwo

object CH0205 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(32); 
  
  val d = new Rational (1,2);System.out.println("""d  : weektwo.Rational = """ + $show(d ));$skip(8); val res$0 = 
  d.den;System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  d + new Rational(3,4);System.out.println("""res1: weektwo.Rational = """ + $show(res$1))}
}


class Rational(x: Int, y: Int) {
	def num = x
	def den = y
	
	override def toString = num + "/" + den
	
	def + (that: Rational) = new Rational(this.num + that.den, that.den + this.num)
}
