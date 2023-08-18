//Um programa para calcular e apresentar o valor do volume de uma lata de óleo. Use a fórmula: VOLUME <-- 3.14159 * RAIO2 * ALTURA.

fun main() {
    println("Cálculo do Volume da Lata de Óleo")
    println("Digite o valor do raio da lata de óleo:")
    val raio = readLine()?.toDoubleOrNull()
    println("Digite o valor da altura da lata de óleo:")
    val altura = readLine()?.toDoubleOrNull()
    if (raio != null && altura != null) {
        val volume = 3.14159 * raio * raio * altura
        println("O volume da lata de óleo é: $volume")
    } else {
        println("Entrada inválida. Certifique-se de inserir valores numéricos válidos.")
    }
}
