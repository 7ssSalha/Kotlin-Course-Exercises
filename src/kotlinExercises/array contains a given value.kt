package kotlinExercises

fun <T> checkArray(array: Array<T>,target: T):Boolean{
    for (element:T in array){
        if (element == target)
            return true
    }
    return false
}

fun main(){
    val stringsArray  = arrayOf("hussein","Mohammad","jane","jack","happy")
    val integersArray = arrayOf(-1,2,3,44,666,123,875,13,12,22,2,-2,0,90,22,-9,-787,13)

    println(checkArray(stringsArray,"Jolie"))
    println(checkArray(stringsArray,"jane"))
    println(checkArray(integersArray,1))
    println(checkArray(integersArray,12))
}