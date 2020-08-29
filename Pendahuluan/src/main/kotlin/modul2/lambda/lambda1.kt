package modul2.lambda

val pesan = { println("Happy to learn Kotlin!!")}

val pernyataan = {params: String -> println(params)}

val hitungLuas = {a: Int, b: Int -> a*b}

fun main(){
    pesan()
    pernyataan("I love you Kotlin!!")
    println(hitungLuas(3,4))
}