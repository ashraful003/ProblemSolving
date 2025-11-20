fun main() {
    println("Enter radius :")
    val pi: Double = 3.14159
    val r: Double = readln().toDouble()
    val result: Double = (4.0/3.0)*pi*r*r*r
    println("Volume = %.3f".format(result))
}