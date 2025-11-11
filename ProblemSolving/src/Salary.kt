fun main() {
    print("Enter the employee number: ")
    val num = readLine()

    print("Enter the working hours: ")
    val hrs = readLine()?.toFloatOrNull()

    print("Enter the amount per hour: ")
    val am = readLine()?.toFloatOrNull()

    if (hrs == null || am == null) {
        println("Please enter valid numbers.")
        return
    }

    val salary = hrs * am
    println("NUMBER = $num")
    println("SALARY = U$ %.2f".format(salary))
}
