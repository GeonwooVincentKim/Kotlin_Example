fun main(){
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    /*
        is -> Downcast the type of instance when it locates in `if`
        as -> 
        1. Downcast the type of instance when declares the variable
        2. Not only `Return Type` but also `variable` downcast
    */
    if (b is Cola){
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink{
    var name = "Drinks"

    open fun drink(){
        println("Drink ${name}")
    }
}

class Cola: Drink(){
    var type = "Coke"

    override fun drink(){
        println("Drink ${type} in the menu of ${name}")
    }

    fun washDishes(){
        println("Wash the dishes with ${type}")
    }
}
