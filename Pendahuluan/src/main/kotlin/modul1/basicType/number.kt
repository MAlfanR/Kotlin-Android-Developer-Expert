package modul1.basicType

fun main(args: Array<String>){
    //print maxValue
    val maxInt = Int.MAX_VALUE
    println(maxInt )

    //modulo
    val number1 : Int = 22
    val number2 : Int = 9
    println(number1 %number2)

    //pembagian
    println(number1 / number2)

    //long
    val q1 = 6
    val q2 = 7L
    val total = q1 + q2
    println(total)
    val q3 = 4.0
    println(q1 / q3)

    //konversi int to double
    val intNumbers = 3
    val doubleNumbers = intNumbers.toDouble()

    //konversi string to int
    val stringNumber = "23323"
    val intNumbe = stringNumber.toInt()
    println(intNumbe)
}