package kotlinExercises

data class EntryTag(
    val id: Long,
    val name: String,
    val color: String,
    val status: String
)

class CompareEntryTag : Comparator<EntryTag>{
    override fun compare(entryTag1:EntryTag?, entryTag2: EntryTag?): Int {
        if(entryTag1 is EntryTag && entryTag2 is EntryTag)
            return entryTag1.name.uppercase().compareTo(entryTag2.name.uppercase())
        return 0
    }

}

fun <T> printList(list: List<T>){
    for (element in list)
        println(element)
}

fun main(){
    val list = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad","#0088dd","ACTIVE"))
        add(EntryTag(5, "rami","#005285","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(7, "Rami","#ffffff","ACTIVE"))
        add(EntryTag(21, "ah","#409bdf","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(76, "Anas","#0079c4","ACTIVE"))
        add(EntryTag(214, "mais","#0088dd","ACTIVE"))
        add(EntryTag(214, "mais","#5c6991","ACTIVE"))
    }

    printList(list)

    val compareEntryTag = CompareEntryTag()
    list.sortWith(compareEntryTag)

    println()
    printList(list)
}