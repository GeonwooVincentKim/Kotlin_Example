fun main(){
    read(7)
    read("감사합니다")

    println()
    println("------------------")
    println()

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    /* Display the results without 2nd Argument */
    deliveryItem("선물", destination="친구집")

    println()
    println("------------------")

    /* Set the number of arguments by input the data in the arguments of `Sum` function */
    sum(1, 2, 3, 4)
    
    println()
    println("------------------")
    
    println(6 multiply 4)
    println(6 multiply (4))

    println(20.3 plus 128.4)
}

fun read(x: Int){
    println("숫자 $x 입니다")
}

fun read(x: String){
    println(x)
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

/* The number of arguments has not set yet */
fun sum(vararg numbers: Int){
    var sum = 0

    for(n in numbers){
        sum += n
    }

    print(sum)
}

/* Use like an Operator */
infix fun Int.multiply(x: Int) : Int = this * x
infix fun Double.plus(x: Double) : Double = this + x
