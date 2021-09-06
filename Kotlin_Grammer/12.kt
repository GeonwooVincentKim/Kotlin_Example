fun main(){
    println(Counter.count);

    Counter.countUp()
    Counter.countUp()
    
    println(Counter.count);
    
    Counter.clear();

    println(Counter.count);
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
