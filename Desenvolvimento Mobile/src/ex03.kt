fun main(){
    print("Nome do Funcionário: ")
    val nome:String = readln()

    print("Salário: ")
    val salario:Double = readln().toDouble()

    println("O funcionário ${nome} tem um salário de R$${String.format("%.2f", salario)} em junho.")
}