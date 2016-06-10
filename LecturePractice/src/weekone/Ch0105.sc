object Ch0105 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)             //> sqrtIter: (guess: Double, x: Double)Double
  
  def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2                         //> improve: (guess: Double, x: Double)Double
  
  def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x)/x < 0.001                //> isGoodEnough: (guess: Double, x: Double)Boolean
  
  def abs(num:Double) = if (num < 0) -num else num//> abs: (num: Double)Double
  
  def sqrt(x:Double) =sqrtIter(1.0,x)             //> sqrt: (x: Double)Double
  
  sqrt(100)                                       //> res0: Double = 10.000052895642693
  sqrt(1e-6)                                      //> res1: Double = 0.0010000001533016628
  
  var y = 8                                       //> y  : Int = 8
  def q(t:Int) = y+t                              //> q: (t: Int)Int
  println (q(4))                                  //> 12
   4*
   8                                              //> res2: Int(32) = 32
   
}