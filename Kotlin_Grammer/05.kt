fun main(){
    var a = 0
    
    while(a < 5){
        println(a++);
    }

    println();
    a = 0

    while(a < 5){
        println(++a);       
    }

    println();
    a = 0
    
    do{
        println(a++)
    } while(a < 5)

    println();
    a = 0

    do{
        println(++a)
    } while (a < 5)

    println();

    /*
        For-Loop values going up
    */
    // For-Loop from 0 to 9, Increase Value -> 1
    for(i in 0..9){
        print("$i ");
    }

    println();

    // For-Loop from 0 to 9, Increase Value -> 3 ==> A multiple of 3
    for(i in 0..9 step 3){
        print("$i ");
    }

    println("\n");

    /*
        For-Loop values going down
    */
    // For-Loop from 9 to 0, Decrease value -> 1
    for(i in 9 downTo 0){
        print("$i ");
    }

    println();

    // For-Loop from 9 to 0, Decrease Value -> 3 ==> A multiple of 3
    for(i in 9 downTo 0 step 3){
        print("$i ");
    }

    println();

    /*
        For-Loop values going up -> Character Type
    */
    for(i in 'a'..'e'){
        print(i);
    }

    println();

    /*
        For-Loop check the condition of values inside the `Inner-For-Loop`
        -> Pass the `if` condition part
    */
    for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break
            println("i: $i - j: $j");
        }
    }

    println();

    /*
        For-Loop check the condition of values inside the `Inner-For-Loop`
        -> Break the program execution
    */
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop
            println("i: $i - j: $j");
        }
    }
}
