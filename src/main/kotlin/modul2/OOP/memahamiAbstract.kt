package modul2.OOP

open class Pengguna{
//    open fun alamatPengguna(){
//
//    }

    override fun toString(): String {
        return "Alfan"
    }
}

abstract class Murid: Pengguna(){
    override  fun toString(): String {
        return super.toString()
    }
}

fun main(args: Array<String>){
    val pengguna = Pengguna()
    println(pengguna)
}

