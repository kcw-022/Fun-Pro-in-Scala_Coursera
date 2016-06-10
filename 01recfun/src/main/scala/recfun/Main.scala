package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def fact(n: Int): Int = 
        if (n <= 1) 1 
        else n * fact(n-1)
      def falling(n: Int, m: Int): Int =
        if (n == m) 
          if (m == 0) 1
          else m
        else n * falling(n-1, m)
      falling(r, c) / fact(r - c)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balAcc(parChars: List[Char], accu: Int): Boolean = {
        if (parChars.isEmpty)
          if (accu == 0) true else false
        else if (accu < 0) false 
        else if (parChars.head.equals('(') ) balAcc(parChars.tail, accu+1)
        else if (parChars.head.equals(')') ) balAcc(parChars.tail, accu-1)
        else balAcc(parChars.tail, accu)
      }
      balAcc(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty || money < 0) 0
      else if (money == 0) 1
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
