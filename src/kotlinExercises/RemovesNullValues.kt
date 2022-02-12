package kotlinExercises

fun main(){
    var list1 = listOf(1,2,null,3,4,5,6,null,0,null,null,-9,-89)
    var list2 = listOf("123","Hello",null,null,"NULL","str",null)
    println(list1)
    println(list2)
    list1 = removeNull(list1)
    list2 = removeNull(list2)
    println(list1)
    println(list2)
}

fun <T> removeNull(list: List<T>):List<T> {
//    return list.filterNot { i: T -> i==null }
    val outputList = mutableListOf<T>()
    for (item in list)
        if (item != null)
            outputList.add(item)
    return outputList
}


