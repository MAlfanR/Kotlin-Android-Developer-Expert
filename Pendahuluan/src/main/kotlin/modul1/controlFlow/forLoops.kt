package modul1.controlFlow

fun main(){
    for (number in 1..10){
        print(number)
        print(" ")
    }
    println()
    //menggunakan until, angka terakhir tidak diikutsertakan
    for (i in 1 until 10){
        print(i)
        print(" ")
    }
    println()
    //perulangan dengan urutan menaik
    for(i in 0..20 step 2){
        print(i)
        print(" ")
    }
    println()
    //dengan urutan menurun
    for(i in 20 downTo 0 step 2){
        print(i)
        print(" ")
    }
    println()

    //menggunakan withIndices
    val arrayNumber = intArrayOf(1,3,5,7)
    for ((index, value) in arrayNumber.withIndex()){
        print("bilangan $value adalah index ke-$index\n")
    }
    println()

    //menggunakan indices
    for(index in arrayNumber.indices){
        print("bilangan ${arrayNumber[index]} adalah indeks ke-$index \n")
    }


}