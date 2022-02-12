package kotlinExercises

fun sayHello(exec :()->Unit){
    exec()
}

fun hello(){
    println("hello")
}
fun main(){
    sayHello(::hello)
}