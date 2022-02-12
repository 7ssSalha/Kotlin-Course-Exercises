package kotlinExercises

fun <T> reverseList(list: List<T>):List<T>{
    val outputList = mutableListOf<T>()
    val listIterator = list.listIterator(list.size)
    while (listIterator.hasPrevious())
        outputList.add(listIterator.previous())
    return outputList
}

fun main(){
    var list1 = listOf(1,2,3,4,5,6,7,8,9,10)
    var list2 = listOf("hussein","salha","sami","mohammad","hello")
    println(list1)
    println(list2)
    list1 = reverseList(list1)
    list2 = reverseList(list2)
    println(list1)
    println(list2)
}