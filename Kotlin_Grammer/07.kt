fun main(){

}

class Animal(var name: String, var age: Int, var type: String){
    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살 입니다.");
    }
}