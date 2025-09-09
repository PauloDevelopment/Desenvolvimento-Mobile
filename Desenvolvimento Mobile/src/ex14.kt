fun main(){
    print("Digite seu salário: ")
    val salario:Double = readln().toDouble()

    val novo_salario = salario * 1.15

    println("Seu novo salário com aumento é de: R$ ${String.format("%.2f", novo_salario)}!")
}