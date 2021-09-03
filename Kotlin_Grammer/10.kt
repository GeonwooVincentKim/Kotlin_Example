fun main(){
    b(::a)

    // It's not necessary to write `String` when you wrote
    // `str` in front of Colon, `:`
    // Because it already described in `Kotlin` Parameter Data-Type

    /* Lambda Function */
    val c: (String)->Unit = { str -> println("$str 람다함수") }
    b(c)
}

/*
    Higher-Order Function - Like a Instance
*/
fun a (str: String){
    println("$str 함수 a");
}

/*
    Unit - No `Return Type` -> void
*/
fun b (function: (String) -> Unit){
    function("b가 호출한")
}
