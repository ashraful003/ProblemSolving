fun main() {
    print("Enter 3 number: \n")
    val a = readLine()?.toDoubleOrNull()
    val b = readLine()?.toDoubleOrNull()
    val c = readLine()?.toDoubleOrNull()

    if (a == null ||b == null ||c == null || a < 0) {
        println("Please enter a positive number.")
        return
    }

    val result = ((a*2.0)+(b*3.0)+(c*5))/(2+3+5)
    println("MEDIA = %.1f".format(result))
}
