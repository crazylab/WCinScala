package wc


class WordCount extends Task {
  private var result: Int = 0

  override def apply(inputString: String) {
    result = inputString.split(" ").length
  }

  override def count: String = {
    "Word Count: " + result
  }
}
