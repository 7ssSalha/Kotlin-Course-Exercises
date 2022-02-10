package kotlinExercises

fun main(){
    val str  = "In this task, you learn about operators and types in the Kotlin programming language."
    val char = 'g'
    val frequency = str.filter { it == char }.length
    println("the frequency of the character '$char' = $frequency ")
}