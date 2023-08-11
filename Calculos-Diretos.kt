fun main() {

    var a: Int 
    var b: Int
    var r: Int 

    println("Digite o primeiro número: ")
    a = readLine().toString().toInt()
    println("Digite o segundo número: ")
    b = readLine().toString().toInt()
    r = a + b 
    println("Soma = $r")
    r = a - b
    println("Subtração = $r")
    r = a * b 
    println("Multiplicação = $r")
    r = a / b
    println("Divisão = $r")
}
