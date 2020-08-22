package modul1.controlFlow

fun main(){
    val a= 4
    val b = 2

    if(a > b){
        println("a lebih besar dari b")
    }else{
        println("b lebih besar dari a")
    }

    val hasil = if(a>b)a else b

    println(hasil)
}