package beecrowd
/*
* Read an integer value corresponding to a person's age
  and print it in years, months and days
* Input : 450
* Output : 1-2-25
*/
fun main() {
    var a = 450
    var year = a/365
    val month = (a%365)/30
    val day = (a%365)%30
    println("Age = $year-$month-$day")
}