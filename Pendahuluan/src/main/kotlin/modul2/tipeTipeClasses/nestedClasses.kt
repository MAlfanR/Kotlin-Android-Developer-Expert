package modul2.tipeTipeClasses

class User{
   inner class Name (private val name: String){
       fun printName(){
           println("Namamu adalah $name")
       }
   }
}

fun main(){
    val pengguna = User()
    pengguna.Name("Alfan").printName()
    pengguna.Name("Alfan Riyadi").printName()

    //bisa langsung membuat instance dari nested class tersebut
    val name = User().Name("Ranger").printName()
}