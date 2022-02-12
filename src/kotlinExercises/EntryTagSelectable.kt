package kotlinExercises

data class EntryTagSelectable(
    val content: EntryTag,
    val isSelected: Boolean,
    val title: String
)

fun createEntryTagSelectableList( Id :Int , list :List<EntryTag> ): List<EntryTagSelectable> {
    val outputList = mutableListOf<EntryTagSelectable>()
    for (tag in list){
        if (tag.id == Id.toLong()){
            outputList.add(EntryTagSelectable(tag,true,"Selected"))
        }
        else{
            outputList.add(EntryTagSelectable(tag,false,"Not Selected"))
        }
    }
    return outputList
}

fun main(){
    val selectedEntryTagId = 43
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

    val outputList = createEntryTagSelectableList(selectedEntryTagId,inputList)

    printList(outputList)
}