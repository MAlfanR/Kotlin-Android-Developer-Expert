package modul2.Extensions

import java.util.*

fun Date.isThursday(): Boolean{
    return getDay() == 2
}

fun main(){
    val date = Date()
    println(date.isThursday())
}