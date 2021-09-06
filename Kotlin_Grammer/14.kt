fun main(){
    var a = Drink()
    a.drink()
}

open class Drink{
    var name = "Some Drink"

    open fun drink(){
        println("Drink ${name}")
    }
}

class Cola: Drink(){
    var type = "Coke"

    override fun drink(){
        println("Drink ${type} in ${name}")
    }

    fun washDishes(){
        println("Wash the dishes with ${type}")
    }
}