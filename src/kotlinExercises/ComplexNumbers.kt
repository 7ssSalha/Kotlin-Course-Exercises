package kotlinExercises

data class ComplexNumber(val realPart:Double,val imgPart:Double){

    constructor(realPart:Int, imgPart:Int) : this(realPart*1.0,imgPart*1.0)

    override fun toString(): String {
        return if (realPart > 0)
            "$imgPart * i + $realPart"
        else if (realPart < 0)
            "$imgPart * i $realPart"
        else
            "$imgPart * i"
    }

    fun add (cmpNumber: ComplexNumber):ComplexNumber{
        return ComplexNumber(this.realPart + cmpNumber.realPart,this.imgPart+cmpNumber.imgPart)
    }
}

fun main(){
    val num1 = ComplexNumber(1,1)
    val num2 = ComplexNumber(-3,-2)
    println(num1)
    println(num2)
    println(num1.add(num2))
}