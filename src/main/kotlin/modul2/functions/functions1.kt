package modul2.functions

fun sum(x: Int, y:Int): Int{
    return x+y
}

//mengubah menjadi single line functions
fun sums (x: Int, y: Int) = x+ y


//unit
fun hello(nama: String): Unit{
    println("Hello $nama")
}

fun hallo (nama: String){
    println(nama)
}
fun main(){
    val hasil = sums(10,8)
    println(hasil)

    val h = penjumlahan().sumss(9, 7)
    println(h)

    hello("Alfan")
    hallo("King")


}