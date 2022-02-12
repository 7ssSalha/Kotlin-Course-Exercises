package kotlinExercises

fun <T,E> compareArrays(array1: Array<T>,array2: Array<E>):Boolean{
    if(array1.size != array2.size){
        return false
    }
    for (index in array1.indices)
        if (array1[index] != array2[index])
            return false
    return true
}

fun main(){
    val intArray1 = arrayOf(1,2,3,4,5,10)
    val intArray2 = arrayOf(1,2,3,4,5,10)
    val strArray  = arrayOf("acs","123","2313","Hello")
    println(compareArrays(intArray1,intArray2))
    println(compareArrays(intArray1,strArray))
}