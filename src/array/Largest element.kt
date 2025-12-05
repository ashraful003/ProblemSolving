package array
/*
*Find the largest element in an array.
* Input : arrayOf(10,101,20,90,20,100)
* Output : 101
 */

fun largeNumber(arr: Array<Int>): Int{
var a = arr[0]
    for (i in 0 until arr.size){
      if (arr[i]>a){
          a = arr[i]
      }
    }
    return a
}