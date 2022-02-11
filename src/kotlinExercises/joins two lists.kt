package kotlinExercises

fun <T> join(list1: List<T>,list2: List<T>):List<T>{
    val outputList = mutableListOf<T>()
    for (item in list1)
        outputList.add(item)
    for (item in list2)
        outputList.add(item)
    return outputList
}

fun main(){
    val stringsList  = listOf("hussein","Mohammad","jane","jack","happy")
    val integersList = listOf(-1,2,3,44,666,123,875,13,12,22,2,-2,0,90,22,-9,-787,13)
    println(join(stringsList,integersList))
}