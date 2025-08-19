fun main(){ // Declarando função main
    print("Digite a massa? ") // Label para solicitar a entrada de massa
    val m:Float = readln().toFloat() // Criando uma constante do tipo Float para armazenar o valor de massa
    print("Digite a aceleração? ") // Label para solicitar a entrada de aceleração
    val a:Float = readln().toFloat() // Criando uma constante do tipo Float para armazenar o valor de aceleração
    print("A força é: ${forca(m, a)}") // Print chamando a função de força passando os argumentos
}

fun forca(m: Float, a: Float): Float{ // Declarando função de força, solicitando como parâmetro duas variáveis do tipo Float
    return m * a // Retornando o cálculo de Força
}