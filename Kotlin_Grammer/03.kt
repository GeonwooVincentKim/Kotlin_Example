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
}

// fun printTypeInterface(a: Int, b: Long, c: Double, d: Float, e: Int, f: Int, g: Boolean, h: Char){
//     println("a: $a\nb: $b\nc: $c\nd: $d\ne: $e\nf: $f\ng: $g\nh: $h");
//     println();
// }

fun printTypeInterface(a: Int, b: Long, c: Double, d: Float, e: Int, f: Int, g: Boolean, h: Char): String{
    var stringValue: String = "a: $a\nb: $b\nc: $c\nd: $d\ne: $e\nf: $f\ng: $g\nh: $h";
    return stringValue;
}