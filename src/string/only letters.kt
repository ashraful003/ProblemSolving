package string
/*
*Check if string contains only letter
* Input: ashraful
* Output: true
 */

fun letter(a: String): Boolean{
   for (i in a){
       if (!((i in 'A'..'Z')||(i in 'a'..'z'))){
           return false
       }
   }
    return true
}