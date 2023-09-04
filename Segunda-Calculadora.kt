fun main() {
    println("Calculadora em Kotlin")
    do {
        val operacoes = mapOf(
            1 to "Soma", 
            2 to "Subtração",
            3 to "Multiplicação", 
            4 to "Divisão", 
            5 to "Sair"
        )
        println("\nOperações disponíveis:")
        operacoes.forEach { (op, descricao) -> println("$op - $descricao") }
        print("\nEscolha a operação desejada (1-5): ")
        val opResp = readLine()?.toIntOrNull() ?: 0
        if (opResp !in operacoes.keys) {
            println("\nOpção inválida. Por favor, escolha uma operação válida.")
            continue
        }
        if (opResp == 5) {
            println("Saindo da calculadora.")
            break
        }
        val x = obterNumero("Digite o primeiro número: ")
        val y = obterNumero("Digite o segundo número: ")
        
        val resultado = when (opResp) {
            1 -> x + y
            2 -> x - y
            3 -> x * y
            4 -> {
                if (y != 0.0) {
                    x / y
                } else {
                    println("Impossível dividir por 0")
                    return
                }
            }
            else -> {
                println("Erro!")
                return
            }
        }
        
        println("O resultado é $resultado")
        
    } while (continuar())
}
fun obterNumero(mensagem: String): Float {
    while (true) {
        print(mensagem)
        val input = readLine()
        try {
            return input?.toFloat() ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println("Por favor, digite um número válido.")
        }
    }
}
fun continuar(): Boolean {
    while (true) {
        print("\nDeseja continuar? (S/N): ")
        val resposta = readLine()?.trim()?.toUpperCase()
        if (resposta == "S" || resposta == "N") {
            return resposta == "S"
        }
        println("Por favor, responda com 'S' para Sim ou 'N' para Não.")
    }
}
