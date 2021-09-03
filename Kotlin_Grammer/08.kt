fun main(){
    var t = Tiger()
    t.eat()
}

open class BigAnimal(){
    fun eat(){
        println("음식을 먹습니다");
    }
}

class Tiger : BigAnimal()
