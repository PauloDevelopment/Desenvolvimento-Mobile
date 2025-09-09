fun main(){
    print("Digite a distância em metros: ")
    val distancia:Double = readln().toDouble()

    km(distancia)
    hm(distancia)
    dam(distancia)
    dm(distancia)
    cm(distancia)
    mm(distancia)
}

fun km(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em quilômetros é de ${String.format("%.2f", distancia/1000)}km!")
}

fun hm(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em hectômetros é de ${String.format("%.2f", distancia/100)}hm!")
}

fun dam(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em decâmetros é de ${String.format("%.2f", distancia/10)}dam!")
}

fun dm(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em decímetros é de ${String.format("%.2f", distancia*10)}dm!")
}

fun cm(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em centímetros é de ${String.format("%.2f", distancia*100)}cm!")
}

fun mm(distancia: Double){
    println("Conversão de ${String.format("%.2f", distancia)} metros em milímetros é de ${String.format("%.2f", distancia*1000)}mm!")
}