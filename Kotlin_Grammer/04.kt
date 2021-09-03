fun main(){
    // var a: Int = 11
    var a = 11

    if(a > 10){
        println("a는 10보다 크다");
    } else {
        println("a는 10보다 작다");
    }

    var testValue: Int = 50
    // var testValue = 50

    // if(testValue is Int){
    if(testValue.equals(Int)){
        println(true);
    } else {
        println(false);
    }

    println();
    doWhen(1);
    doWhen("String");
    doWhen(12L);
    doWhen(3.141592);
    doWhen("This is String. You can change this part");
    doWhen(0x01010101);
}

// Any: Allowed all of type of Kotlin Programming Language
fun doWhen(a: Any){
    /*
        When you just want to show what you've texted
        (Which mean without `Return` behaviour)
    */
    /*when(a){
        1 -> println("정수 1입니다")
        "String" -> println("문자열입니다.")
        
        is Long -> println("Long Type 변수입니다")
        !is String -> println("String 입니다")

        else -> println("어떤 조건도 만족하지 않습니다")
    }*/

    /*
        When you want to `Return` some particular values
    */
    var result = when(a){
        1 ->"정수 1입니다"
        "String" -> "문자열입니다."
        
        is Long -> "Long Type 변수입니다"
        !is String -> "String 입니다"

        else -> "어떤 조건도 만족하지 않습니다"
    }

    println(result);
}
