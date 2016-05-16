package wc


class LineCount extends Task {
  private var result = 0

  override def apply(inputString: String) = {
    result = inputString.split("\n").length
  }

  override def count: String = {
    "Line Count: " + result
  }
}
