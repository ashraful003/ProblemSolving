/*
 * Find first non-repeating character.
 * Input : ashraful
 * Output : s
 */

fun ab(c:String):Char?{
    var result = ""
    for(i in c.indices){
        var count = 0
        for(j in c.indices) {
            if(c[i]==c[j]){
                count ++
            }
        }
        if(count == 1){
            return c[i]
        }
    }
    return null
}
