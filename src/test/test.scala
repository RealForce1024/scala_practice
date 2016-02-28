package test

/**
 * test
 * @author fqc
 */
object test {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]) {
    //    println(add(3,5))
    //printDirFiles()
    printDirFilesWithFilter()
  }

  /**
   * filesHere
   */
  def printDirFiles(): Unit = {
    var filesHere = (new java.io.File(".")).listFiles()
    for (file <- filesHere) {
      println(file)
    }
    //间接访问（不推荐）
    for (file <- 0 to filesHere.length - 1) {
      println(filesHere(file))
    }

    for (i <- 0 to 5) { print(i) }
    for (i <- 0 until 5) { print(i) }
  }

  def printDirFilesWithFilter(): Unit = {
    var filesHere = (new java.io.File(".")).listFiles()
    for (file <- filesHere
         if file.getName.endsWith(".md")
         if file.isFile)
    println(file) //for 省略时 默认后一句是在{}中
    println(1 to 11)

  }

  def testArrayAndList(): Unit ={
    
  }



}
