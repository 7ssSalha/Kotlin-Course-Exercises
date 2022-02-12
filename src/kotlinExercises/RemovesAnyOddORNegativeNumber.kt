package kotlinExercises

fun main(){
    val list = mutableListOf(1,-2,3,4,5,6,10,-8)
    val filtered = list.filterNot { i: Int -> (i < 0 || i.isOdd()) }
    println(filtered)
}