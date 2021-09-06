fun main(){
    EventPrinter().start()
}

interface EventListener{
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener){
    fun count(){
        for(i in 1..100){
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener{
    override fun onEvent(count: Int){
        if(count == 100){
            print("${count}")
        } else {
            print("${count} - ")
        }
    }

    fun start(){
        val counter = Counter(this)
        counter.count()
    }
}