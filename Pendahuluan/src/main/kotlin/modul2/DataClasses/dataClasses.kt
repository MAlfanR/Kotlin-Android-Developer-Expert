package modul2.DataClasses

data class Student(var name: String = "Alfan", var major: String, var phone: String)

fun main(){
    val student = Student("Ranger", "Computer Science", "072348239842")
    println(student)
    println("Your name is ${student.name}")
    println("Your major is ${student.major}")
    println("Your phone is ${student.phone}")

    //copy data
     val studentA = student.copy(phone = "345345354")

    println(studentA)

    //memetakkan objek menjadi variabel
    val (name, major, phone) = student
    println("$name $major $phone")

    //destucting declarations
    val a = student.component1()
    val b = student.component2()
    val c = student.component3()

    println("$a $b $c")
}