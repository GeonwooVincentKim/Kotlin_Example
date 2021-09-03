fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("홍길동", 2003)

    a.introduce();
    b.introduce();
    c.introduce();
}

/* Use Class-Attribute Only */
// class Person(var name: String, val birthYear: Int)

/* Create Class-Function */
class Person(var name: String, val birthYear: Int){
    fun introduce(){
        println("안녕하세요, ${birthYear}년생 ${name}입니다.");
    }
}
