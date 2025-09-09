fun main(){
    print("Digite o valor de A: ")
    val a:Int = readln().toInt()

    print("Digite o valor de B: ")
    val b:Int = readln().toInt()

    print("Digite o valor de C: ")
    val c:Int = readln().toInt()

    val delta = (b*b) - 4*a*c
    println("O delta é de ${delta}!")
}