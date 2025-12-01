package string

/**
 * Find first repeating character.
 * Input : ashraful
 * Output :
 */
fun repeat(a:String):Char?{
    for(i in a.indices){
        var first = a[i]
        for(j in i+1 until a.length){
            var second = a[j]
            if(first == second){
                return first
            }
        }

    }
    return null
}