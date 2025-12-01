
/**
 * Reverse each word in a sentence.
 * Input: md ashraful alam
 * Output : ashraful
 */
package string


fun largew(a: String): String {
    var largeword = ""
    var currentword = ""
    var largecount = 0
    var currentcount = 0

    for (i in a) {
        if (i != ' ') {
            currentword = currentword + i
            currentcount++
        } else {
            if (currentcount > largecount) {
                largeword = currentword
                largecount = currentcount
            }
            currentword = ""
            currentcount = 0
        }
    }
    if (currentcount > largecount) {
        largeword = currentword
        largecount = currentcount
    }
    return largeword
}
