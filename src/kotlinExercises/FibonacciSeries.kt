package kotlinExercises

tailrec fun fibonacci(number: Int):Int{
    return if (number == 1 || number == 2)
        1
    else
        fibonacci(number - 1) + fibonacci(number - 2)
}

fun main () {
    println(fibonacci(7))
}