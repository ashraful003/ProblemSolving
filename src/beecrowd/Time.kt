package beecrowd
/*
*Read an integer value, which is the duration in seconds of a certain
 event in a factory, and inform it expressed in hours:minutes:seconds.
* Input : 4050
* Output : 1:7:30
 */
fun main(){
    var a = 4050
    val hours = a/3600
    val minuts = (a%3600)/60
    val second = a%60
    println("Time = $hours:$minuts:$second")
}