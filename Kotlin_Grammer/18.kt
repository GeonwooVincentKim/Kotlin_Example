fun main(){
    // var a: String? = null
    // println(a?.uppercase())
    // println(a?:"default".uppercase())
    // println(a!!.uppercase())

    var a: String? = "Kotlin Exam"
    
    a?.run{
        println(uppercase())
        println(lowercase())
    }
}