package kotlinExercises

fun Double.round(nDigits:Int):Double{
    var formatStr = "%."+nDigits+"f"
    return String.format(formatStr,this).toDouble()
}

fun main() {
    var num = 3.66675
    println(num.round(2))
}