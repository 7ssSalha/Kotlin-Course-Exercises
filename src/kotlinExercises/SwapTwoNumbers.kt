package kotlinExercises

fun main(){
    var a = 7
    var b = 4
    println("before swap: a= $a b= $b")
    val temp = a
    a = b
    b = temp
    println("after swap:  a= $a b= $b")
}