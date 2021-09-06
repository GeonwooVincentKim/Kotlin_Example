fun main(){
    val a = General("보영", 212)

    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    println()
    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618))

    println()

    var list = listOf(Data("보영", 212), Data("루다", 306), Data("아린", 618))
    for((c, d) in list){
        println("${c}, ${d}")
    }

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

class General(val name: String, val id: Int)

/* 
    Data Class is like a `String` Class in Java. 
    It inheritate from Object and Overrides what the `String` Class needs.
    The Data Class is also similar with `String` in Kotlin
*/
data class Data(val name: String, val id: Int)

enum class State(val message: String){
    SING("SING"),
    EAT("EAT"),
    SLEEP("SLEEP");

    fun isSleeping() = this == State.SLEEP
}
