fun main() {
    println("Calculadora Simples")
    println("Escolha a operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")

    val choice = readLine()?.toIntOrNull()
    if (choice != null && choice in 1..4) {
        println("Digite o primeiro número:")
        val num1 = readLine()?.toDoubleOrNull()
        println("Digite o segundo número:")
        val num2 = readLine()?.toDoubleOrNull()
        if (num1 != null && num2 != null) {
            val result = when (choice) {
                1 -> num1 + num2
                2 -> num1 - num2
                3 -> num1 * num2
                4 -> {
                    if (num2 != 0.0) {
                        num1 / num2
                    } else {
                        println("Não é possível dividir por zero.")
                        return
                    }
                }
                else -> {
                    println("Operação inválida.")
                    return
                }
            }
            println("Resultado: $result")
        } else {
            println("Entrada inválida. Certifique-se de inserir números válidos.")
        }
    } else {
        println("Escolha uma opção válida de 1 a 4.")
    }
}
