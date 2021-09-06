import kotlinx.coroutines.*

fun main(){
    val scope = GlobalScope
    
    runBlocking{
       	val a = launch{
        	for(i in 1..5){
            	println(i)
        	}
    	} 
        
        val b = async {
            "async 종료"
        }
        
        println("async 대기")
        println(b.await())
        
        println("launch 대기")
        a.join()
        println("launch 종료")
    }  	
}
