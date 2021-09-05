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

    /*
        Original Way to use Instance of Class

        var a = Book("Contents", 10000)
        a.name = "[초특가]" + a.name
        a.discount()
    */
    var a = Book("Contents", 10000)
        a.name = "[초특가]" + a.name
        a.discount()

    a.run{
        println("No Apply Scope Function")
        println("상품명 : ${name}, 가격 ${price}원")
    }
        
    println()
    var applyInstance = Book("Demo's Kotlin", 10000).apply{
        name = "[초특가]" + name
        discount()
    }

    applyInstance.run{
        println("With Apply Scope Function")
        println("상품명 : ${name}, 가격 ${price}원")
    }
}

class Book(var name: String, var price: Int){
    fun discount(){
        price -= 2000
    }
}