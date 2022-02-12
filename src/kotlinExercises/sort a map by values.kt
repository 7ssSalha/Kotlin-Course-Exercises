package kotlinExercises


class CustomComparator(private var map: Map<String, Int>) : Comparator<Any?> {
    override fun compare(o1: Any?, o2: Any?): Int {
        if (map[o1] == map[o2]) {
            if(o1 is String && o2 is String){
                return o1.compareTo(o2)
            }
            return 1
        }
        else
            return map[o1]!!.compareTo(map[o2]!!)
    }
}

fun main(){
    val map = mapOf(
        "France" to 80,
        "England" to 70,
        "Spain" to 90,
        "Italy" to 95,
        "USA" to 60,
        "Canada" to 77,
        "UAE" to 5,
        "KSA" to 50,
        "Greece" to 74,
        "Egypt" to 60)


    val customComparator = CustomComparator(map)
    val sortedMap = map.toSortedMap(customComparator)

    println(map)
    println(sortedMap)
}
