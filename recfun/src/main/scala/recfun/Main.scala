package recfun
import common._

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
    if(r==0||c==0||r==c) 1
    else pascal(c-1,r-1)+pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balancing(st:Int, chars:List[Char]):Boolean={
      if(chars.isEmpty) st==0
      else
        if(chars.head!='('&&chars.head!=')')balancing(st,chars.tail)
        else if(chars.head=='(') balancing(st+1,chars.tail)
        else
          if(chars.head==')') st>0 && balancing(st-1,chars.tail)
          else balancing(st,chars.tail)
    }
    balancing(0,chars)


  }



  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
