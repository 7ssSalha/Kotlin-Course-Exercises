package kotlinExercises

fun naturalNumbersSum(number: Int):Int{
    return (number * (number + 1) )/2
}

fun naturalNumbersSum(number: List<Int>):Int{
    var sum = 0
    number.map { if (it > 0) sum += it }
    return sum
}
fun main(){
    //the sum of the first n numbers in Natural numbers
    println(naturalNumbersSum(10))
    //calculate the sum of Natural numbers only in a list of numbers
    val numbers = listOf(-1,-300,200,30,0,0,12,400,-90,0,77)
    println(naturalNumbersSum(numbers))
}