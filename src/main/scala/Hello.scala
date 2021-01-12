import util._

object Hello {
  def main(args: Array[String]) = {
    HelloActor.hello()
    HelloPersistence.hello()
    println("Welcome to SBT")
  }
}
