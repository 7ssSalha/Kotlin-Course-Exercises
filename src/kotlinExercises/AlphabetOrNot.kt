package kotlinExercises

fun main(){
    val characters = listOf('a','c','1','k','_','!','S',':','K')
    for (char in characters)
        if (char.isLetter())
            println("'$char' is in the alphabet")
        else
            println("'$char' is not in the alphabet")
}