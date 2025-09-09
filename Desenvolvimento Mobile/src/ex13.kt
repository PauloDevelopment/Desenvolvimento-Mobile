fun main(){
    print("Digite o valor do produto: ")
    val preco:Double = readln().toDouble()

    val valor_final = preco * 0.95

    println("O preço promocional do produto é de: ${valor_final}")
}