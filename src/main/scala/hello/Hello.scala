package hello

case class Bar(a: Int, b: Int)

object Hello {
  def main(args: Array[String]): Unit = {
    println(Bar(1, 4).hashCode())
    println(Bar(5, 7).hashCode())
    println(Bar(10, 11).hashCode())
  }
}
