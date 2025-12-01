package string

/**
 * Find first repeating character.
 * Input : "listen", "silent","hello", "world"
 * Output :true, false
 */

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    for (i in 0 until str1.length) {
        var count1 = 0
        var count2 = 0
        for (j in 0 until str1.length) {
            if (str1[i] == str1[j]) count1++
        }
        for (j in 0 until str2.length) {
            if (str1[i] == str2[j]) count2++
        }
        if (count1 != count2) return false
    }

    return true
}
