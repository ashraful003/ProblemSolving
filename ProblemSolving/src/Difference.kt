fun main() {
    print("Enter four numbers (a, b, c, d):\n")
    val a = readLine()?.toDoubleOrNull()
    val b = readLine()?.toDoubleOrNull()
    val c = readLine()?.toDoubleOrNull()
    val d = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null || d == null) {
        println("Invalid input! Please enter valid numbers.")
        return
    }

    val result = (a * b) - (c * d)
    println("Result = $result")
}
