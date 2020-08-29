package modul2.delegatedProperties

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Tidak ada nama"){
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main(args: Array<String>){
    val user = User()
    user.name = "First"
    user.name = "Second"
    user.name =" Third"
}