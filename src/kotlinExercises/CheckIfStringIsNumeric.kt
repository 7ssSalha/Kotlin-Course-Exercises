package kotlinExercises

fun String.isNumeric():Boolean{
    var pointCount = 0
    for (char in this) {
        if (char.isDigit()){
            continue
        }
        else if (char == '.'){
            ++pointCount
            if (pointCount > 1)
                return false
        }
    }
    return true
}

fun main(){
    val intString ="77"
    val doubleString ="124.456"
    val floatString ="124.456f"
    println(intString.isNumeric())
    println(doubleString.isNumeric())
    println(floatString.isNumeric())
}