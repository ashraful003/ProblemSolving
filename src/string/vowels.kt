/*
 * Check vowels
 * Input : Ashraful
 *Output : 3
*/
fun count(c:String):Int{
    var result = 0
    for(i in c){
        if(i=='a' || i=='e'|| i=='i'|| i=='o'|| i=='u'|| i=='A'|| i=='E'|| i=='I'|| i=='O'|| i=='U'){
            result++
        }
    }
    return result
}