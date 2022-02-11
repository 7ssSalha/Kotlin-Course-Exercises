package kotlinExercises

fun Char.isVowel():Boolean{
    return listOf('a','e','i','o','u').contains(this)
}

fun Char.isConsonant():Boolean{
    return !listOf('a','e','i','o','u').contains(this) && this.isLetter()
}

fun main(){
    val a='a'
    val b='b'
    println(a.isVowel())
    println(b.isVowel())
    println(b.isConsonant())
}