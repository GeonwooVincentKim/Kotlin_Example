fun main(){
    /* Lambda Function with parameter - `Int` Return type */
    val calculate: (Int, Int) -> Int = {a, b -> 
        println(a)
        println(b)
        a + b
    }

    /* Labmda Function without Parameter */
    // val a: () - >Unit = {println("No Parameter")}

    println("calculate result : $calculate")
    // println("a result : $a")
}
