package hello

object Hello {
  def foo(int: Int): Unit = {
    println(int >>> (-13))
    println(int >>> (32 -13))
  }

  def main(args: Array[String]): Unit = {
    foo(0xffffff)
  }
}
