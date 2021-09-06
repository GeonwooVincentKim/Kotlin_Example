import kotlinx.coroutines.*

fun main(){
    val scope = GlobalScope
    
    scope.launch{
        for(i in 1..5){
            print(i)
        }
    }
}
