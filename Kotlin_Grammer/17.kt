fun main(){
    var test1 = "Test.Kotlin.String"
    println(test1.length)

    println(test1.lowercase())
    println(test1.uppercase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))
    println(test2.joinToString(" - "))
}