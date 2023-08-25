//Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100). 
fun main() {
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println("A soma dos cem primeiros números inteiros é $sum")
}
