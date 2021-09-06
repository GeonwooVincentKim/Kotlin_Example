fun main(){
    /* Singleton Pattern Example Code */
    println(Counter.count);

    Counter.countUp()
    Counter.countUp()
    
    println(Counter.count);
    
    Counter.clear();

    println(Counter.count);
    println();

    /* Companion Object Pattern (Static Pattern) Example Code */
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총합 : ${FoodPoll.total}")
}

/* SingleTon Pattern */
object Counter{
    var count = 0

    fun countUp(){
        count++
    }

    fun clear(){
        count = 0
    }
}

/* Companion Object Example Code */
class FoodPoll(val name: String){
    companion object{
        var total = 0   
    }

    var count = 0

    fun vote(){
        total++
        count++
    }
}