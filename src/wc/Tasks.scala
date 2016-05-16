package wc

import java.util

class Tasks {
  private val availableTasks: util.HashMap[String, Task] = new util.HashMap[String, Task]()
  availableTasks.put("-l", new LineCount())
  availableTasks.put("-c", new CharCount())
  availableTasks.put("-w", new WordCount())

  private val tasks: util.ArrayList[Task] = new util.ArrayList[Task]()

  def addTask(symbol: String): Unit = {
    val task: Task = availableTasks.get(symbol)
    tasks.add(task)
  }

  def apply(inputData: String): util.ArrayList[Task] = {
    val iterator: util.Iterator[Task] = tasks.iterator()
    while (iterator.hasNext){
      iterator.next.apply(inputData)
    }
    tasks
//    for (task: Task <- tasks) {
//      task.apply(inputData)
//    }
  }
}
