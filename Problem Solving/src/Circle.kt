fun main() {
   val pi: Double = 3.14159
    println("Enter a length : ")
    val r: Double = readln().toDouble()
    val result: Double = pi*(r*r)
    println("A = %.4f".format(result))

}