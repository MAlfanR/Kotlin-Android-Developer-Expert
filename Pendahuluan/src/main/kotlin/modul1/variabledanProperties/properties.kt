package modul1.variabledanProperties

class Student{ var studentName : String = "" }

class Teacher{
    var teacherName: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Name : $value"
        }

}
fun main(){
    val student = Student()
    student.studentName = "Rohman"
    val name = student.studentName

    println(name)

    val teacher = Teacher()
    teacher.teacherName ="King"
    val names = teacher.teacherName

    println(names)
}