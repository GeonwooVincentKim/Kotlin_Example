fun main(){
    read(7)
    read("감사합니다")

    println()
    println("------------------")
    println()

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")
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
