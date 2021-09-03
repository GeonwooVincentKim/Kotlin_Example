fun main(){
    // Type Interface
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b01010101

    var g = true
    var h = 'c'

    var printStringValue: String = printTypeInterface(a, b, c, d, e, f, g, h);

    var ayo: Int? = null
    
    if(ayo == null){
        println("ayo: $ayo -> is NULL");
    } else {
        println("ayo: $ayo");
    }

    ayo = 10;

    if(!(ayo.equals(null))){
        println("ayo: $ayo\n");
        println(printStringValue);
    }

    var number1: Int = 10
    var number2: Int = 20
    var number3: Int = 30

    var sum: Int = addNumber(number1, number2, number3);
    println("sum: $sum");

    var sumNew: Int = addNumberShort(number1, number2, number3);
    println("sumNew: $sumNew");
}

// Without Return Type --> void Type
// fun printTypeInterface(a: Int, b: Long, c: Double, d: Float, e: Int, f: Int, g: Boolean, h: Char){
//     println("a: $a\nb: $b\nc: $c\nd: $d\ne: $e\nf: $f\ng: $g\nh: $h");
//     println();
// }

// With Return Type --> String Type
fun printTypeInterface(a: Int, b: Long, c: Double, d: Float, e: Int, f: Int, g: Boolean, h: Char): String{
    var stringValue: String = "a: $a\nb: $b\nc: $c\nd: $d\ne: $e\nf: $f\ng: $g\nh: $h";
    return stringValue;
}

// General Function --> This function have several features
fun addNumber(a: Int, b: Int, c: Int): Int{
    var sum: Int = a + b + c;
    return sum;
}

/* Simple Express Function
    1. This function has single-feature only, not have several features
    2. Skip determine `Return` Type
*/
fun addNumberShort(a: Int, b: Int, c: Int) = a + b + c;
