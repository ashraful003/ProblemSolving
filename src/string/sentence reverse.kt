package string

/**
 * Reverse each word in a sentence.
 * Input: md ashraful alam
 * Output : dm lufarhsa  mala
 */

fun strevers(a:String):String{
    var result = ""
    var word = ""
    for(i in a){
        if(i != ' '){
            word= word + i
        }
        else{
            var reverse = ""
            for(j in word.length - 1 downTo 0){
                reverse = reverse + word[j]
            }

            result = result + reverse + " "
            word = " "
        }
    }
    var reverse = ""
    for(i in word.length - 1 downTo 0){
        reverse = reverse + word[i]
    }
    result = result + reverse
    return result
}