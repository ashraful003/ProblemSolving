package beecrowd

import kotlin.math.sqrt
/*Distance Between Two Points
* Input: 1.0, 7.0, 5.0, 9.0
* Output: 4.472
*/

fun dis(a: Double,b: Double,c: Double,d: Double): Double{
    var result = 0.0
    result = sqrt(((c-a)*(c-a))+((d-b)*(d-b)))
    return result
}