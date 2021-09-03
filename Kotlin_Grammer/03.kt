fun main(){
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b01010101

    var g = true
    var h = 'c'

    var ayo: Int? = null
    
    if(ayo == null){
        println("ayo: $ayo -> is NULL");
    } 

    ayo = 10;

    if(!(ayo.equals(null))){
        println("ayo: $ayo");
    }
}