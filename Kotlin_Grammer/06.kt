fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("홍길동", 2003)

    println("a: $a - b: $b - c: $c");
    println();

    var d = Person("이루다")
    var e = Person("차은우")
    var f = Person("류수정")

    println("d: $d - e: $e - f: $f");
    println();

    // a.introduce();
    // b.introduce();
    // c.introduce();
}

/* Use Class-Attribute Only */
// class Person(var name: String, val birthYear: Int)

/* Create Class-Function */
class Person(var name: String, val birthYear: Int){
    /* Basic Constructor(Initializer) - Declare when create `Class` */
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.");
    }

    /* 
        Secondary Constructor(Initialzer) 
        1. Declare features(or property) addtionally when need it 
        2. Initializer Overloading
    */
    constructor(name: String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }

    // fun introduce(){
    //     println("안녕하세요, ${birthYear}년생 ${name}입니다.");
    // }
}
