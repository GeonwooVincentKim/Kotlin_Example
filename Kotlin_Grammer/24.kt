fun main(){
    data class Person(val name: String, val birthYear: Int)
    
    val personList = listOf(Person("유나", 1992), Person("조이", 1996), Person("츄", 1999), Person("유나", 2003))
    
    println(personList.associateBy { it.birthYear })
    println(personList.groupBy{it.name})
}
