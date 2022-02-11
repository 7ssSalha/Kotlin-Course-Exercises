package kotlinExercises

//fun largest(numbers: List<Number>):Number{
//    var largest:Number = numbers[0]
//
//    for (num:Number in numbers)
//        if (num > largest)
//            largest = num
//
//    return largest
//}

fun main(){
    val numbers = listOf(4,2,5,1,4,6,10,20,4,7,7,90,43,56)
//    println("Largest = ${largest(numbers)}

    var largest = numbers[0]

    for (num in numbers)
        if (num > largest)
            largest = num

    println("Largest = $largest")
}