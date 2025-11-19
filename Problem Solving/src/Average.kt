fun main(){
    println("Enter 3 number :\n")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val result: Double = (((a*2)+(b*3)+(c*5))/(2+3+5))
    println("MEDIA = ${result}")
}