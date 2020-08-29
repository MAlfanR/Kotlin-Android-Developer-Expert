package modul2.functions

//menggunakan named arguments
fun introduce(name: String, city: String){
    println("Hallo, namaku $name dan tinggal di kota $city")
}

//default argumen
fun x (name: String ="Alfan", city: String){
    println("Hallo, namaku $name dan tinggal di kota $city")
}

//vararg (variable argument lis)
fun sum (vararg angka: Int): Int{
    var total = 0
    for (i in angka){
        total+=i
    }

    return total
}
fun main(){
    introduce("Alfan", "Belitang")
    x(city="Lampung")

    println(sum(1,2,3,4,5))
}