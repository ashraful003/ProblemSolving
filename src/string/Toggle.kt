/*
 * Toggle case of every character.
 * Input : Ashraful Alam
 * Output : aSHRAFUL aLAM
 */

fun toggle(c:String):String{
    var result = ""
    for(i in c){
        if(i in 'A'..'Z'){
            result = result +(i+32)
        }
        else if(i in 'a'..'z'){
            result = result+(i-32)
        }
        else{
            result = result + i
        }
    }
    return result
}
