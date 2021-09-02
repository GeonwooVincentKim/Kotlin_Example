fun main(){
    // First way
    var a: Int = 123
    println(a);

    // Second way
    var b: Int
    b = 321
    println(b);

    // Nullable way -> Could make `Null Pointer Exception` Error
    var c: Int? = null
    println(c);

    // 10진수
    var intValue: Int = 1234
    var longValue: Long = 1234L
    println("$intValue - $longValue");

    // 16진수
    var intValueByHex: Int = 0x1af
    println("intValue -> Hex : $intValueByHex");
    
    // 2진수
    var intValueByBin: Int = 0b10110110
    println("intValue -> Bin : $intValueByBin");

}