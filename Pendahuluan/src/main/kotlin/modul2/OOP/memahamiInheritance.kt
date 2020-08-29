package modul2.OOP

open class Users{
    open fun userAddress(): String{
        return "Lampung"
    }
}

//harus pakai open, karena nilai default sebuah kelas pada kotlin bersifat dinal
open class Student: Users(){
    //kalo didepan override ditambahkan final, maka tidak ada kelas lain yang boleh melakukan override lagi
    override fun userAddress(): String{
        return super.userAddress()
    }
}

class InformaticsStudent: Student(){
    override fun userAddress(): String {
        return super.userAddress()
    }
}