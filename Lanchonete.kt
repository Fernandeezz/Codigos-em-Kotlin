//O cardápio de uma lanchonete é o seguinte:
//Especificação 	  Código 	  Preço
//Cachorro quente 	 100 		  1,20
//Bauru simples 	   101 		  1,30
//Bauru com ovo 	   102 		  1,50
//Hambúrger 	       103 		  1,20
//Cheeseburguer 	   104 		  1,30
//Refrigerante 	     105 		   1,00
//Faça um programa na Linguagem Kotlin que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item. 

fun main() {
    val menu = mapOf(
        100 to Pair("Cachorro quente", 1.20),
        101 to Pair("Bauru simples", 1.30),
        102 to Pair("Bauru com ovo", 1.50),
        103 to Pair("Hambúrger", 1.20),
        104 to Pair("Cheeseburguer", 1.30),
        105 to Pair("Refrigerante", 1.00)
    )
    println("Cardápio:")
    for ((code, item) in menu) {
        println("$code - ${item.first} - R$${item.second}")
    }
    print("Digite o código do item pedido: ")
    val itemCode = readLine()?.toInt() ?: return
    print("Digite a quantidade: ")
    val quantity = readLine()?.toInt() ?: return
    val selectedMenuItem = menu[itemCode]
    if (selectedMenuItem != null) {
        val totalPrice = selectedMenuItem.second * quantity
        println("Total a ser pago pelo ${selectedMenuItem.first}: R$${totalPrice}")
    } else {
        println("Item não encontrado no cardápio.")
    }
}
