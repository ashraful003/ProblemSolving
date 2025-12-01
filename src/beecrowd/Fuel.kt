package beecrowd
/*
* Little John wants to calculate and show the amount of spent fuel liters on a trip,
  using a car that does 12 Km/L.The input file contains two integers. The first one
  is the spent time in the trip (in hours). The second one is the average speed
  during the trip (in Km/h)
* Input : 10, 85
* Output : 70.833
*/

fun fuel(a: Double, b: Double): Double{
    var result: Double = 0.0

    result = ((b/12)*a)
    return result
}