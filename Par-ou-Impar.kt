//Leia um número inteiro e apresente uma mensagem informando se o número é par ou ímpar. 

fun main() {
    println("Verificador de Número Par ou Ímpar")
    println("Digite um número inteiro:")
    val numero = readLine()?.toIntOrNull()
    if (numero != null) {
        if (numero % 2 == 0) {
            println("O número $numero é par.")
        } else {
            println("O número $numero é ímpar.")
        }
    } else {
        println("Entrada inválida. Certifique-se de inserir um número inteiro.")
    }
}
