fun main(){
    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    println()
    println("-------------------------")
    println()

    val a = LateInitSample()
    
    println(a.getLateInitText())
    a.text = "A value that reallocated newly"
    println(a.getLateInitText())
}

class FoodCourt(){
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}'s price is ${price} Korea Won")
    }
    
    companion object{
        const val FOOD_CREAM_PASTA = "Cream Pasta"
        const val FOOD_STEAK = "Steak"
        const val FOOD_PIZZA = "Pizza"
    }
}

/* 
    LateInit -> 
    1. Determine the type of variable and allocates Object later
    2. Cannot use variables until allocates `Initialize Value`
*/
class LateInitSample{
    lateinit var text: String
    fun getLateInitText(): String{
        if(::text.isInitialized){
            return text
        } else {
            return "Default Value"
        }
    }
}
