/*
Schreibe hier deine Antwort hin.
PH
Microsoft

Die for Schleife geht die Liste durch, aber mit der Bedingung; dass es von index 2 (dritte Stelle) anfängt und
gibt jedes Element untereinander in der Konsole aus.
 */

fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}