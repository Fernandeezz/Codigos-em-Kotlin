//Faça um programa na Linguagem Kotlin que que receba um número e mostre o fatorial desse número. 
fun main() {
    print("Digite um número para calcular o fatorial: ")
    val number = readLine()?.toInt() ?: return
    val factorial = calculateFactorial(number)
    println("O fatorial de $number é $factorial")
}
fun calculateFactorial(n: Int): Long {
    if (n == 0 || n == 1) {
        return 1
    }
    var result: Long = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}
