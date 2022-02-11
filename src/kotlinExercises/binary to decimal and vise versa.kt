package kotlinExercises

import kotlin.math.pow

fun Int.toBinary():String{
    var string=""
    var q = this
    while (q != 0){
        val rem = q % 2
        q /= 2
        string += rem
    }
    return string.reversed()
}

fun String.toDecimal():Int{
    var num = 0
    for((index,digit) in this.reversed().withIndex())
        if (digit == '1')
            num += 2.toDouble().pow(index).toInt()
    return num
}

fun main(){
    val decimalNumber = 12
    println(decimalNumber.toBinary())
    val binaryNumber ="010101100110"
    println(binaryNumber.toDecimal())
}