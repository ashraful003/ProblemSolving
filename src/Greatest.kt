import kotlin.math.abs

fun main() {
    println("Enter three element: \n")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val maiorAB = (a + b + abs(a - b)) / 2
    val maior = (maiorAB + c + abs(maiorAB - c)) / 2

    println("$maior eh o maior")
}