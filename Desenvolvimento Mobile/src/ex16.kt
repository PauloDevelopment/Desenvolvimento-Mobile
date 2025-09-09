fun main(){
    print("Digite a quantidade de dias trabalhados: ")
    val dias:Int = readln().toInt()

    val salario = (25 * 8) * dias

    println("O salário do funcionário é de: R$ ${salario}!")
}