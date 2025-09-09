fun main(){
    print("Digite um número: ")
    val num:Double = readln().toDouble()

    println("O dobro de ${num} é ${num*2}")
    print("A terça parte de ${num} é ${String.format("%.5f", num/3)}")
}