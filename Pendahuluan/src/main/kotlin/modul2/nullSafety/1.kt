package modul2.nullSafety

fun main(){
    //kalo pake tanda "?" sebuah variabel bisa menjadi null
    var x: String? = "Ran"
    x= null

    println(x)

    //memeriksa null menggunakan kondisi
    if(x != null && x.length >0){
        println("String of length ${x.length}")
    }else{
        println("Empty String")
    }

    //safecalls
    println(x?.length)
}