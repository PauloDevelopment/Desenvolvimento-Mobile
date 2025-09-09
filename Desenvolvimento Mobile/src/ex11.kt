fun main(){
    print("Digite a largura da parede: ")
    val largura:Double = readln().toDouble()

    print("Digite a altura da parede: ")
    val altura:Double = readln().toDouble()

    val area = largura * altura

    println("É necessário ${area / 2} latas de tinta para pintar uma área de ${area}m²!")
}