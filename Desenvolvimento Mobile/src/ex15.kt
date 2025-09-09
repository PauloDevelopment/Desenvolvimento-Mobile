fun main(){
    print("Digite a quantidade de quilómetros percorridos: ")
    val km:Double = readln().toDouble()

    print("Quantos dias o carro foi alugado? ")
    val dias:Int = readln().toInt()

    val valor = (90 * dias) + (0.20 * km)

    println("O valor a pagar pelo aluguel do carro é de: R$ ${String.format("%.2f", valor)}!")
}