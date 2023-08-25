//Criar um vetor A do tipo inteiro de 5 elementos, solicitar os valores para o usuário e inserir no vetor 
//A. Criar um vetor B do tipo inteiro e  ler o vetor A, sendo que para cada elemento lido, deve-se calcular 
//o fatorial e gravar em B. Após ler todos os elementos do vetor A, mostrar os dois vetores.
fun main() {
    val size = 5
    val vectorA = IntArray(size)
    val vectorB = LongArray(size)
    for (i in 0 until size) {
        print("Digite o valor ${i + 1} do vetor A: ")
        vectorA[i] = readLine()?.toIntOrNull() ?: 0
    }
    for (i in 0 until size) {
        vectorB[i] = calculateFactorial(vectorA[i])
    }
    println("Vetor A: ${vectorA.joinToString(", ")}")
    println("Vetor B (Fatoriais): ${vectorB.joinToString(", ")}")
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
