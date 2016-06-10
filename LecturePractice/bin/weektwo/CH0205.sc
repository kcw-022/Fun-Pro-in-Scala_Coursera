package weektwo

object CH0205 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val d = new Rational (1,2)                      //> d  : weektwo.Rational = 1/2
  d.den                                           //> res0: Int = 2
  d + new Rational(3,4)                           //> res1: weektwo.Rational = 5/5
}


class Rational(x: Int, y: Int) {
	def num = x
	def den = y
	
	override def toString = num + "/" + den
	
	def + (that: Rational) = new Rational(this.num + that.den, that.den + this.num)
}