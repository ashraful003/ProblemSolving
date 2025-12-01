package string

/**
 * Reverse each word in a sentence.
 * Input: my password 123456
 * Output : my password ******
 */

fun replaceDigit(a:String):String{
    var result = ""
    for(i in a){
        if(i>= '0' && i<='9'){
            result = result + '*'
        }
        else{
            result = result + i
        }
    }
    return result
}
