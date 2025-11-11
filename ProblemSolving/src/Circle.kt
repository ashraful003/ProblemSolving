fun main() {
    val pi = 3.14159

    print("Enter the radius: ")
    val a = readLine()?.toDoubleOrNull()

    if (a == null || a < 0) {
        println("Please enter a positive number.")
        return
    }

    val area = pi * a * a
    println("A = %.4f".format(area))
}
