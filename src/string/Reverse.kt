package string
//String reverse
//Input : "Ashraful"
//Output : "lufarhsA"
fun reverse(c:String):String{
    var result = ""
    for(i in c.length-1 downTo 0){
        result = result + c[i]
    }
    return result
}