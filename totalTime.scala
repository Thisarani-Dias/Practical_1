package practical_1

object totalTime {
  def totaltime(e:Double, t:Double) = e*8 + t*7

  def main(args: Array[String]): Unit = {
    var e = 2+2
    var t = 3
    var time = totaltime(e,t)
    println("Total time is " + time + " min")
  }
}
