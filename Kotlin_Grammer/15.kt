fun main(){
    UsingGeneric(A1()).doShouting()
    UsingGeneric(B1()).doShouting()
    UsingGeneric(C1()).doShouting()

    doShouting(B1())
}

fun <T: A1> doShouting(t: T){
    t.shout()
}

open class A1{
    open fun shout(){
        println("A is Shouting")
    }
}

class B1: A1(){
    override fun shout(){
        println("B is Shouting")
    }
}

class C1 : A1(){
    override fun shout(){
        println("C is Shouting")
    }
}

class UsingGeneric<T: A1> (val t: T){
    fun doShouting(){
        t.shout()
    }
}
