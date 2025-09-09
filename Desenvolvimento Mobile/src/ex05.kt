fun main(){
    print("Nota 1: ")
    val nota1:Double = readln().toDouble()

    print("Nota 2: ")
    val nota2:Double = readln().toDouble()

    println("A média entre ${nota1} e ${nota2} é igual a ${media(nota1, nota2)}.")
}

fun media(nota1:Double, nota2:Double): Double{
    return (nota1 + nota2) / 2
}