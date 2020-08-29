package modul2.higherOrderFunction

//arti higher function adalah sebuah fungsi lain yang dijadikan paramater di dalam sebuah fungsi
fun getNickname(fullName: String, nickName: String, yourName: (String, String) ->String){
    val result = yourName(fullName, nickName)
    println(result)
}



fun main(){
    val name :(String, String) -> String = {realName, heroName -> "My name is $realName, yo can call me $heroName"}
    getNickname("M. Alfan", "Alfan", name)

    //bisa dijalankan seperti ini
    getNickname("Alfan Riyadi", "Alfan",{
        realName, heroName -> "My name is $realName, yo can call me $heroName"
    })
}