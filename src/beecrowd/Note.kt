package beecrowd
/*
*  In this problem you have to read an integer value and calculate the smallest
   possible number of banknotes in which the value may be decomposed.
* Input : 2888
* Output: All note in BD
*/
fun main(){
    var a = 2888
    println("Total taka = ${a}")
    val note1000 = a/1000
    println("1000 taka note : ${note1000}")
    a = a%1000

    val note500 = a/ 500
    println("500 taka note : ${note500}")
    a = a%500

    val note200 = a/ 200
    println("200 taka note : ${note200}")
    a = a%200

    val note100 = a/ 100
    println("100 taka note : ${note100}")
    a = a%100

    val note50 = a/ 50
    println("50 taka note : ${note50}")
    a = a%50

    val note20 = a/ 20
    println("20 taka note : ${note20}")
    a = a%20

    val note10 = a/ 10
    println("10 taka note : ${note10}")
    a = a%10

    val note5 = a/ 5
    println("5 taka note : ${note5}")
    a = a%5

    val note2 = a / 2
    println("2 taka note : ${note2}")
    a = a%2

    val note1 = a/ 1
    println("1 taka note : ${note1}")

}
