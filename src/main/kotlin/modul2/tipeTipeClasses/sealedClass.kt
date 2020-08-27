package modul2.tipeTipeClasses

sealed class Operation{
    class Add(val value: Int): Operation()
    class Divide(val value: Int): Operation()
    class Multiply(val value: Int): Operation()
    class Substract(val value: Int): Operation()
}

fun execute(x: Int, operation: Operation): Int = when (operation){
    is Operation.Add -> operation.value + x
    is Operation.Divide -> operation.value / x
    is Operation.Substract -> operation.value - x
    is Operation.Multiply -> operation.value *x
}

fun main(){
    val operation = Operation.Add(100)
    val result = execute(10, operation)
    println("Hasilnya $result")
}

