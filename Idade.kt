//Um programa que leia a idade de uma pessoa expressa em ano, mês e dias e mostre-as somente em dias

fun main() {
    println("Calculadora de Idade em Dias")
    println("Digite a idade em anos:")
    val anos = readLine()?.toIntOrNull()
    println("Digite a idade em meses:")
    val meses = readLine()?.toIntOrNull()
    println("Digite a idade em dias:")
    val dias = readLine()?.toIntOrNull()
    if (anos != null && meses != null && dias != null) {
        val idadeEmDias = anos * 365 + meses * 30 + dias
        println("A idade é de $idadeEmDias dias.")
    } else {
        println("Entrada inválida. Certifique-se de inserir valores numéricos válidos.")
    }
}
