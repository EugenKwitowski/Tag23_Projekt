import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1, 100)
    var zahl: Int


    do {
        println("\n Gebe deine Zahl ein:")
        zahl = readln().toInt()

        if (zahl < computerGuess){
            println("Deine Zahl ist kleiner als die gemerkte Zahl des Computers!")
        } else if (zahl > computerGuess){
            println("Deine Zahl ist größer als die gemerkte Zahl des Computers!")
        } else if (zahl == computerGuess){
            println("\nDu hast das Spiel gewonnen! \n Die gemerkte Zahl des Computers war $computerGuess")
        }

    } while (zahl != computerGuess)
}