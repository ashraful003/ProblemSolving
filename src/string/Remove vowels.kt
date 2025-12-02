package string
/*
*Remove vowel from a string
* Input: programming
* Output: programing
*/

fun vowel(a: String):String{
    var result = ""
    for (i in a){
        if (i!='a' && i!='e' && i!='i' && i!='o' && i!='u' && i!='A' && i!='E' && i!='I' && i!='O' && i!='U'){
            result = result + i
        }
    }
    return result
}