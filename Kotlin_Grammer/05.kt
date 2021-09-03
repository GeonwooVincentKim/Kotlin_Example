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
}