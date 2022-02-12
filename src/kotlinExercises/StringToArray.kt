package kotlinExercises

fun String.toArray():Array<Char?>{
    val array= arrayOfNulls<Char>(this.length)
    var i = 0
    while (i < this.length){
        array[i] = this[i]
        i++
    }
    return array
}

fun main(){
    val string = "Kotlin"
    val arrayOfChar = string.toArray()
    for (char in arrayOfChar)
        println(char)
}