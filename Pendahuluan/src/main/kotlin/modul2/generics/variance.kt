package modul2.generics

//terdapat 2 kata kunci yakni in dan out
class TypedClas <in T> {
    fun toString(value: T): String{
        return value.toString()
    }
}

class TypedOut <out T> (private val value: T){
    fun get(): T{
        return value
    }
}
fun main(){

}