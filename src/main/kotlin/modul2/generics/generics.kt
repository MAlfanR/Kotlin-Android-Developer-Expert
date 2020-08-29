package modul2.generics


class TypedClass<T> (variabel : T){
    val value: T = variabel
}
fun main(){

    val stringType = TypedClass("Hi, Alfan")
    val intType = TypedClass(10)
    println(stringType.value)
    println(intType.value)
}