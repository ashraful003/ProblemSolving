package array
/*
*Find the smallest element in an array.
* Input : arrayOf(10,15,9,1,30,0)
* Output : 0
 */

fun small(arr: Array<Int>): Int{
    var a = arr[0]
    for (i in 0 until arr.size){
        if (arr[i]<a){
            a = arr[i]
        }
    }
    return a
}