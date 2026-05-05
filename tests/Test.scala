object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(75, 73, 23, 18, 10)
    assert(Policy.score(signalcase_1) == 84)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(65, 106, 10, 8, 4)
    assert(Policy.score(signalcase_2) == 174)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(95, 77, 23, 14, 7)
    assert(Policy.score(signalcase_3) == 142)
    assert(Policy.classify(signalcase_3) == "review")
  }
}
