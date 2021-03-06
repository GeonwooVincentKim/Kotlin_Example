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

    var b = Product("콜라", 1000)
    var c = Product("콜라", 1000)
    
    var d = b
    var e = Product("사이다", 1000)

    println(b == c)
    println(b === c)

    println(b == d)
    println(b === d)

    println(b == e)
    println(b === e)
}

class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean{
        if(other is Product){
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}