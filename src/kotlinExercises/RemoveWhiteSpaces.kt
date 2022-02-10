package kotlinExercises

fun main(){
    val str ="   Hel   lo I'm Kotlin   ...    123   "
    val stringWithoutWhiteSpaces = str.filterNot { it.isWhitespace() }
    println(stringWithoutWhiteSpaces)
}