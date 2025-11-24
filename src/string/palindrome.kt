package string
/*
  Palindrome
  Input: Ashraful
  Output: Not a palindrome
 */

fun revers(c:String):String{
    var result = ""
    for(i in c.length-1 downTo 0){
        result = result + c[i]
    }
    if (c.equals(result)){
        return "Palindrome"
    }
    else{
        return "Not a palindrome"
    }
}