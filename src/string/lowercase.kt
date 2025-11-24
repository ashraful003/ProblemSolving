/*
 * Convert string to lowercase.
 * Input : Ashraful Alam
 * Output : ashraful alam
 */

fun lowercase(c:String):String{
    var result = ""
    for(i in c){
        if(i in 'A'..'Z'){
            result = result +(i+32)
        }
        else{
            result = result+i
        }
    }
    return result
}
