package modul2.tipeTipeClasses


//enum merupakan kumpulan objek yang didefinisikan menjadi tipe data constant
enum class Gender{
    Pria, Wanita
}


enum class Users(field: String){
    NAME("M. Alfan Riyadi"),
    EMAIL("alfan@gmail.com"),
    PHONE("03249234324")
}

//objek dari sebuah enum sendiri dapat mendeklarasikan sebuah anonymous classes
enum class Userss(val field: String){
    NAME("M. Alfan Riyadi"){
        override fun println(){
            println("Nama mu $field")
        }
    },
    EMAIL("alfan@gmail.com"){
        override fun println(){
            print("Email mu $field")
        }
    },

    PHONE("93249324523"){
        override fun println(){
            println("Kontak mu $field")
        }
    };


    abstract fun println()

}


fun main(){
    Userss.NAME.println()
    Userss.EMAIL.println()
    Userss.PHONE.println()

    println(enumValues<modul2.tipeTipeClasses.Gender>().joinToString { it.name })

}