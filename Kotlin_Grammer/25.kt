fun main(){
    val foodCourt = FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
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
