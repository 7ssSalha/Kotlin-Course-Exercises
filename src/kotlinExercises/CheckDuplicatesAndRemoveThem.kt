package kotlinExercises

fun <T> MutableList<T>.removeDuplicates(){
    val newList = mutableListOf<T>()
    val dups = mutableListOf<T>()
    for (item in this) {
        if (newList.contains(item)) {
            dups.add(item)
        }else{
            newList.add(item)
        }
    }

    for (dup in dups)
        this.remove(dup)
}

fun main(){
    val inputList = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad","#0088dd","ACTIVE"))
        add(EntryTag(5, "rami","#005285","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(7, "Rami","#ffffff","ACTIVE"))
        add(EntryTag(21, "ah","#409bdf","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(76, "Anas","#0079c4","ACTIVE"))
        add(EntryTag(214, "mais","#0088dd","ACTIVE"))
        add(EntryTag(214, "mais","#5c6991","ACTIVE"))
    }

    inputList.removeDuplicates()
    printList(inputList)

}
