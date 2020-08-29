package modul2.delegatedProperties

class Pengguna ( val map: Map <String, Any?>){
    val name: String by map
    val age: Int by map

}

fun main(){
    val user = Pengguna(mapOf(
        "name" to "Alfan",
        "age" to 20
    ))

    println(user.map)
    println(user.age)
    println(user.name)
    println(user)


}