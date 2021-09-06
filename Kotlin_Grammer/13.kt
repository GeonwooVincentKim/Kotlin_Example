fun main(){

}

interface EventListener{
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener){
    fun count(){
        for(i in 1..100){
            if(i% 5 == 10) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener{
    override fun onEvent(count: Int){
        print("${count} - ")
    }

    fun start(){
        val counter = Counter(this)
        counter.count()
    }
}