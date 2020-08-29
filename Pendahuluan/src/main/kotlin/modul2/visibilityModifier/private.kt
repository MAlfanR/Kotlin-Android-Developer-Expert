package modul2.visibilityModifier


class Cat (val name: String){
    private var weight = 1
    fun eat(){
        println("$name is makan")
        weight++
    }

    fun getWeight(): Int{
        return  weight
    }
}
fun main(){
    val garfield = Cat("Moko")
    garfield.eat()
    println(garfield.getWeight())
}