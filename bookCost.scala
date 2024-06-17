package practical_1

object bookCost {
  def discountedprice(c: Double, d: Double) = c * (1 - d)

  def totalcost(n: Integer) = n * discountedprice(24.95, 40 / 100)

  def additional(N: Integer) = N * 0.75

  def totalwholesale(x: Integer, y: Integer) = totalcost(x) + additional(y)

  def main(args: Array[String]): Unit = {
    var x=50
    var y=10
    var total = totalwholesale(x,y)
    println("Total wholesale cost is " + total)
  }
}
