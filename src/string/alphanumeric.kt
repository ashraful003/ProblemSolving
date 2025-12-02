package string

/*
*Check if string contains only letter
* Input: @Hello!
* Output: true
 */

fun alphanumeric(a: String): Boolean{
    for (i in a){
        if (!((i in 'A'..'Z')&&(i in 'a'..'z')&&(i in '0'..'9'))){
            return true
        }
    }
    return false
}
