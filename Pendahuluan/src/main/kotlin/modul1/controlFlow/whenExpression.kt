package modul1.controlFlow


fun main(){
    val x = 4
    when(x){
        1 -> println("x==1")
        2 -> println("x==2")
        else ->{
            println("x bukanlah 1 ataupun 2")
        }
    }

    //pengecekan when untuk nilai dalam range atau collection
    val a = 20
    when(a){
        in 1..10 -> println("a is in the range")
        !in 1..10 -> println("a di luar dari range")
        else -> println("Tidak keduanya")
    }
}