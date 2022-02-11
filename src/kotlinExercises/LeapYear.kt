package kotlinExercises

fun isLeapYear(year:Int):Boolean = (year % 4) == 0

fun main(){
    val years = List(35){it+1990}
    for (year in years)
        if (isLeapYear(year))
            println("$year is a Leap Year")
        else
            println("$year is not a Leap Year")
}