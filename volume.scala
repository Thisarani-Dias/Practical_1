package practical_1

object volume {
  def convert(c: Double): Double = c * 1.8000 + 32.000

  def main(args: Array[String]): Unit = {
    var r = 5
    var volume = convert(r)
    println("Volume of the sphere is " + volume)
  }
  
}
