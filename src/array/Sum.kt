package array
/*
*Calculate the sum of all elements in an array.
* Input : arrayOf(1,2,3,4,5)
* Output : 15
 */

fun sum(array: Array<Int>):Int{
    var result = 0
    for (i in 0 until array.size){
        result += array[i]
    }
    return result
}