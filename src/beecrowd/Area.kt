package beecrowd

fun main() {
    println("Enter the three element :")
    val pi: Double = 3.14159
    val a: Double = readln().toDouble()
    val b: Double = readln().toDouble()
    val c: Double = readln().toDouble()
    val triangle: Double = (a*c)/2
    val circle: Double = pi*c*c
    val trapezium: Double = ((a+b)*c)/2
    val square: Double = b*b
    val rectangle: Double = a*b
    println("Triangle = %.3f".format(triangle))
    println("Circle = %.3f".format(circle))
    println("Trapezium = %.3f".format(trapezium))
    println("Square = %.3f".format(square))
    println("Rectangle = %.3f".format(rectangle))

}