fun main(){
    val a = listOf("Apple", "Strawberry", "Pear")
    println(a[1])

    for(fruit in a){
        if(a.size == fruit.length - 1){
            print("${fruit}")
        } else {
            print("${fruit} : ")
        }
    }
    
    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)
    
    b.shuffle()
    println(b)

    b.sort()
    println(b)
}
