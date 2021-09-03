fun main(){
    b(::a)
}

/*
    Higher-Order Function - Like a Instance
*/
fun a (str: String){
    println("$str 함수 a");
}

/*
    Unit - No `Return Type` 
*/
fun b (function: (String) -> Unit){
    function("b가 호출한")
}
