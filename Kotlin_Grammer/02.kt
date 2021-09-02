fun main() {
    // Type Casting - Explicit Type Casting
    // --> Explicit Type Casting(Forced Casting)
    // --> Implicit Type Casting(Auto Casting)
    var a: Int = 54321
    var b: Long = a.toLong()
    println("a: $a\nb: $b\n");

    // Array - Have owns values
    // var intOldArr = {1, 2, 3, 4, 5} --> Could occurs error because this is not a array in Kotlin
    var intArr = arrayOf(1, 2, 3, 4, 5);
    println("intArr: $intArr");

    for(i in intArr){
        println(i);

        if(i == intArr.size){
            println("$i\n")
        }
    }

    // Array - Initialize Array
    var nullArr = arrayOfNulls<Int>(5)
    println("nullArr: $nullArr");

    intArr[2] = 8
    println("intArr[4]: " + intArr[4] + "\n");

    for(i in intArr){
        println(i);

        if(i == intArr.size){
            println("$i\n");
        }
    }
}