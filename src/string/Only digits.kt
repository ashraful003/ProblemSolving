package string
/*
*Check if string contains only digits.
* Input : 1234567
* Output : true
 */

fun digit(a: String): Boolean{
    for (i in a){
        if (i<'0' || i>'9'){
            return false
        }
    }
    return true
}