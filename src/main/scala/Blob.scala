object Blob {

  def ma = 23
  def ga: Int = "nope"
  def wa = {
    val a = ma*2
    val l = List.empty[Int]
    l.foldLeft("haha") { (z, x) =>
      z.toInt + x
    }
  }
}
