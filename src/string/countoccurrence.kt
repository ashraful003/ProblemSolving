package string

/**
 * Find first repeating character.
 * Input :"ashraful",'a'
 * Output : 2
 */

fun countoccurrence(a:String, b:Char):Int{
    var count = 0
    for(i in a){
        if(i == b){
            count++
        }
    }
    return count
}




