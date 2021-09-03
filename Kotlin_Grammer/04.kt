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
}
