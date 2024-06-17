package practical_1

object areaOfDisk {
  def areaOfDisk(r: Double): Double = math.Pi * r * r

  def main(args: Array[String]): Unit = {
    var r = 5
    var areaofdisk = areaOfDisk(r)
    println("Area of the disk is " + areaofdisk)
  }
}
