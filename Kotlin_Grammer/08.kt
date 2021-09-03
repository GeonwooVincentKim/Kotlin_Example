fun main(){
    var t = Tiger()
    t.eat()
  
    println();
    
    var r = Rabbit()
    r.eat()
    r.sniff()
}

/* Parent Class (Super Class) */
open class BigAnimal(){
    /* Allows to override method in Child Class (Sub Class) */
    open fun eat(){
        println("음식을 먹습니다");
    }
}

class Tiger : BigAnimal(){
    /*
        Override Annotation
        1. Java -> @Override
        2. Kotlin -> override fun methodName(){}
    */
    override fun eat(){
        println("고기를 먹습니다");
    }
}

/* 
    Abstract Class (Abstraction) 
    - 1. Declare specific Method to emphasize that the developers should implements specific Method
    - 2. Java -> abstract class
    - 3. Kotlin -> abstract class
*/
abstract class NormalAnimal(){
    abstract fun eat()
    fun sniff(){
        println("킁킁");
    }
}

class Rabbit : NormalAnimal(){
    override fun eat(){
        println("당근을 먹습니다");
    }
}

/* Interface */
interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println("음식을 먹습니다");
    }
}

class MiniDog : Runner, Eater{
    override fun run(){
        println("우다다다 뜁니다");
    }

    override fun eat(){
        println("허겁지겁 먹습니다");
    }
}
