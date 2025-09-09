fun main(){
    print("Digite o valor para conversão: ")
    val valor:Double = readln().toDouble()

    val dolar = 5.44

    println("A conversão de R$ ${String.format("%.2f", valor)} é de $${String.format("%.2f", valor/dolar)} doláres!")
}