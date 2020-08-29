package modul1.basicType

fun main(){
    val singleLineString = "Hi, Alfan!"
    val multiLineString = """
        Hi, Alfan, 
        Happy Codinggg!!!!
    """.trimIndent()

    val a = "Hi, Alfan, \n" + "happy coding :)"
    println(multiLineString)
    println(a)
    println(singleLineString[0])

    val w = 90
    println("Your number is $w")

    val kosong = false
    val stock = 12

    val checkStock = "Stock mu ${if(kosong)0 else stock}"
    println(checkStock)


}