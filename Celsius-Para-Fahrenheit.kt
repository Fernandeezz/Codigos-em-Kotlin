//Faça um programa na Linguagem Kotlin que apresente os valores de conversão de graus Celsius em Fahrenheit, de 1 em 1 grau, 
//iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. 
fun main() {
    println("Graus Celsius\tGraus Fahrenheit")
    println("--------------------------------")
    for (celsius in 10..100) {
        val fahrenheit = celsiusToFahrenheit(celsius)
        println("$celsius°C\t\t${String.format("%.2f", fahrenheit)}°F")
    }
}
fun celsiusToFahrenheit(celsius: Int): Double {
    return celsius * 9.0 / 5.0 + 32.0
}
