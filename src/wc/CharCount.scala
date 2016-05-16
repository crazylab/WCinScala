package wc


class CharCount extends Task {
  private var result = 0

  override def apply(inputString: String) = {
    result = inputString.length
  }

  override def count: String = {
    "Char Count: " + result
  }
}
