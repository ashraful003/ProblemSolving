/*
 * Count spaces in a string.
 * Input : As hr af ul Al am
 * Output : 5
 */

fun space(c:String):Int{
    var result = 0
    for(i in c){
        if(i in " "){
            result++
        }
    }
    return result
}
