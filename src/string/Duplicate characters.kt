package string
/*
*Remove duplicate characters from a string
* Input: programming
* Output: programing
*/

fun duplicate(a: String): String{
    var result = ""
    for (i in a.indices){
        var size = 0
        for (j in 0 until i){
          if (a[i] == a[j]){
              size = 1
          }
        }
        if (size == 0){
            result = result + a[i]
        }
    }
    return result
}