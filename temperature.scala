package practical_1

object temperature {
  def temp(t: Double) = t * 1.8000 + 32.0

  def main(args: Array[String]): Unit = {
    var t = 35
    var temprature = temp(t)
    println("Temperature in Fahrenheit is" + temprature)
  }
}
