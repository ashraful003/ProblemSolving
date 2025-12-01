package string

/**
 * Count consonants in a string.
 * Input : ashraful
 * Output : 5
 */

fun consonent(c:String):Int{
    var count = 0
    for(i in c){
        var vowel = i=='a'|| i=='e'|| i=='i'|| i=='o'|| i=='u'|| i=='A'|| i=='E'|| i=='I'|| i=='O'|| i=='U'
        if(!vowel){
            count++
        }
    }
    return count
}