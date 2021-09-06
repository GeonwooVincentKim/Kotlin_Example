fun main(){
    var a: String? = null
    println(a?.uppercase())
    println(a?:"default".uppercase())
    println(a!!.uppercase())
}