fun main(){
    print("Digite a quantidade cigarros que você fuma por dia: ")
    val cigarros_dias:Int = readln().toInt()

    print("Quantos anos você já fumou? ")
    val anos_fumando:Int = readln().toInt()

    val qtd_cigarros = cigarros_dias * (anos_fumando * 365)
    val dias_perdidos = (qtd_cigarros * 10) / (60*24)

    println("Essa pessoa perdeu ${dias_perdidos} dias de vida fumando ao longo de ${anos_fumando} anos fumando!")
}