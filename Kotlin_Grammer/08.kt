fun main(){
    var t = Tiger()
    t.eat()
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
