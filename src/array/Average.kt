package array
/*
*Calculate the average of array elements.
* Input : arrayOf(1,2,3,4,5)
* Output : 3
 */

fun average(array: Array<Int>): Int{
    val size = array.size
    var result = 0
    for (i in 0 until size){
        result += array[i]
    }
    return result/size
}