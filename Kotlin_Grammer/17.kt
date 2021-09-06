fun main(){
    var test1 = "Test.Kotlin.String"
    println(test1.length)

    println(test1.lowercase())
    println(test1.uppercase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))
    println(test2.joinToString(" - "))

    println(test1.substring(5..10))

    val nullString: String? = null
    var emptyString = ""
    var blankString = " "
    var normalString = "A"

    println();
    println("-----------------------------");
    println();

    checkStringIsNull(nullString.toString());
    checkStringIsNull(emptyString);
    checkStringIsNull(blankString);
    checkStringIsNull(normalString);

    // println(nullString.isNullOrEmpty())
    // println(emptyString.isNullOrEmpty())
    // println(blankString.isNullOrEmpty())
    // println(normalString.isNullOrEmpty())
}

fun checkStringIsNull(value: String) : Boolean{
    var getValue = value.isNullOrEmpty();
    println("Your value status : ${getValue}")
    return getValue;
}