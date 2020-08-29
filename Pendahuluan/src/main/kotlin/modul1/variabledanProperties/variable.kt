package modul1.variabledanProperties

fun main(){
    // menggunakan val tidak dapat diganti setelah di inisialisasikan
    val a: String = "Alfan"
    //ketika diganti menghasilkan error
//    a = "king"
    //disederhanakan
    val x = "Alfan"

    //menggunakan var
    var s = "ABC"
    s = "Dicoding"

    println("${a+ "   " + x + "   "+ s}")
}