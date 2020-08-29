package modul2.delegatedProperties

//standard delegate

// lazy

val lazyValue: String by lazy {
    //kode  println("Ranger") hanya akan dicetak 1 kali saja
    println("Ranger")
    "Hi, Alfan"
}

fun main(){
    println(lazyValue)
    println(lazyValue)


}