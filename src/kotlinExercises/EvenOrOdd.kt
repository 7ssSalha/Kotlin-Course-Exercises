package kotlinExercises

fun evenOrOdd(number:Int):Boolean = (number % 2) == 0

fun Int.isOdd() :Boolean = (this % 2) == 1

fun Int.isEven():Boolean = (this % 2) == 0

fun main(){
    val number = 13
    if(evenOrOdd(number))
        println("Even Number")
    else
        println("Odd Number")

    if (14.isOdd())
        println("Odd Number")
    else
        println("Even Number")

    if (15.isEven())
        println("Even Number")
    else
        println("odd Number")
}