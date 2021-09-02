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

    // Double Type
    var doubleValue: Double = 123.5
    println("doubleValue : $doubleValue");

    // Exponent Number Type
    var doubleValueWithExample: Double = 123.5e10
    println("doubleValueWithExample: $doubleValueWithExample");

    // 16 Bit Float
    var floatValue: Float = 123.5f
    println("floatValue: $floatValue");

    // Character Type
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'
    println("charValue: $charValue - koreanValue: $koreanCharValue");

    // Boolean Type
    var booleanValue: Boolean = true
    println("booleanValue: $booleanValue");

    // String type
    var stringValue: String = "one line string test"
    var newStringValue = "more shorter version of one line string test"
    println("stringValue: $stringValue\nnewStringValue: $newStringValue");

    // Variable line of String
    var multiLineStringValue = """
        Multiple
        Line
        String
        Test
    """
    println("multiLineStringValue: $multiLineStringValue");
}
