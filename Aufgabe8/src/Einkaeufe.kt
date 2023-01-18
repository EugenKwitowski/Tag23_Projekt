fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    var number: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var numberToString = number.toString()
    for (i in 0..shoppingList.size - 1) {

        if (shoppingList[i] == "Reis"){
            println(numberToString[1] + shoppingList[i])
        }
        if (shoppingList[i] == "Tofu"){
            println(numberToString[4] + shoppingList[i])
        }
        if (shoppingList[i] == "Brokkoli"){
            println(numberToString[7] + shoppingList[i])
        }
        if (shoppingList[i] == "Nudeln"){
            println(numberToString[10] + shoppingList[i])
        }
        if (shoppingList[i] == "Apfelsaft"){
            println(numberToString[13] + shoppingList[i])
        }
        if (shoppingList[i] == "Zitronen"){
            println(numberToString[16] + shoppingList[i])
        }
        if (shoppingList[i] == "Eis"){
            println(numberToString[19] + shoppingList[i])
        }
        if (shoppingList[i] == "Erdbeeren"){
            println(numberToString[22] + shoppingList[i])
        }
        if (shoppingList[i] == "Torte"){
            println(numberToString[25] + shoppingList[i])
        }
    }

    val listSize = shoppingList.size
    for (i in 0 until listSize){
        var lebensMittel = shoppingList[i]
        println("${shoppingList.indexOf(lebensMittel) + 1}. $lebensMittel")
    }
}