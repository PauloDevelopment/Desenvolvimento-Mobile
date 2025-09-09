fun main(){
    print("Digite um valor: ")
    val num1:Int = readln().toInt()

    print("Digite outro valor: ")
    val num2:Int = readln().toInt()

    println("A soma entre ${num1} e ${num2} é igual a ${soma(num1, num2)}.")
}

fun soma(num1: Int, num2: Int): Int{
    return num1 + num2
}