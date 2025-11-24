/*
 * Convert string to uppercase
 * Input : Ashraful
 * Output : ASHRAFUL
 */
fun uppercase(c:String):String{
    var result = ""
    for(i in c){
        if(i in 'a'..'z'){
            result = result +(i-32)
        }
        else{
            result = result+i
        }
    }
    return result
}
