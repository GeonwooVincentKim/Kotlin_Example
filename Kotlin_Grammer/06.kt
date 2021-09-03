fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("홍길동", 2003)

    println("안녕하세요. ${a.birthYear}년생 ${a.name}입니다.");
    println("안녕하세요. ${b.birthYear}년생 ${b.name}입니다.");
    println("안녕하세요. ${c.birthYear}년생 ${c.name}입니다.");
}

/* Use Class-Attribute Only */
// class Person(var name: String, val birthYear: Int)

/* Create Class-Function */
class Person(var name: String, val birthYear: Int){
    
}
