//leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente. 
fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 1..3) {
        print("Digite o ${ordinal(i)} número: ")
        val number = readLine()?.toIntOrNull()

        if (number != null) {
            numbers.add(number)
        } else {
            println("Valor inválido. Tente novamente.")
            return
        }
    }
    numbers.sort()
    println("Números em ordem crescente:")
    for (number in numbers) {
        println(number)
    }
}
fun ordinal(number: Int): String {
    return when (number) {
        1 -> "primeiro"
        2 -> "segundo"
        3 -> "terceiro"
        else -> "$number-ésimo"
    }
}
