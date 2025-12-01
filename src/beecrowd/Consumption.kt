package beecrowd

fun main() {
    println("Enter your distance and amount of fuel : \n")
    val x: Int = readln().toInt()
    val y: Float = readln().toFloat()
    val result: Float = x/y
    println("Cover :%.4f".format(result))
}