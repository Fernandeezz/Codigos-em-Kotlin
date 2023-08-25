//Faça um programa na Linguagem Kotlin que leia tenha 3 opções: 
//    1 - Fatorial
//    2 - Quadrado de um número
//    3 - Volume de uma lata
//    4 – Sair do Programa
//Utilize os conceitos de funções em Kotlin
fun main() {
    while (true) {
        println("Escolha uma opção:")
        println("1 - Calcular Fatorial")
        println("2 - Calcular Quadrado de um Número")
        println("3 - Calcular Volume de uma Lata")
        println("4 - Sair do Programa")
        print("Opção: ")
        val choice = readLine()?.toIntOrNull() ?: continue
        when (choice) {
            1 -> calculateFatorial()
            2 -> calculateSquare()
            3 -> calculateVolume()
            4 -> {
                println("Saindo do programa.")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
fun calculateFatorial() {
    print("Digite um número para calcular o fatorial: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        var factorial = 1L
        for (i in 1..number) {
            factorial *= i
        }
        println("O fatorial de $number é $factorial")
    } else {
        println("Valor inválido.")
    }
}
fun calculateSquare() {
    print("Digite um número para calcular o quadrado: ")
    val number = readLine()?.toDoubleOrNull()

    if (number != null) {
        val square = number * number
        println("O quadrado de $number é $square")
    } else {
        println("Valor inválido.")
    }
}
fun calculateVolume() {
    print("Digite o raio da lata: ")
    val radius = readLine()?.toDoubleOrNull()
    print("Digite a altura da lata: ")
    val height = readLine()?.toDoubleOrNull()
    if (radius != null && height != null) {
        val volume = Math.PI * radius * radius * height
        println("O volume da lata é $volume")
    } else {
        println("Valores inválidos.")
    }
}
