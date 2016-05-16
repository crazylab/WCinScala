package wc

import java.util

object WC {
  def main(args: Array[String]) {
    val inputString: String = "This\nis\na\nString."

    val tasks: Tasks = new Tasks
    for (option: String <- args) {
      tasks.addTask(option)
    }

    val results: util.ArrayList[Task] = tasks.apply(inputString)

    val iterator: util.Iterator[Task] = results.iterator()
    while (iterator.hasNext)
      println(iterator.next().count)
  }
}
