/*
Schreibe hier deine Antwort hin.
auf der 30. Strasse kann man 30"km/h fahren.
auf der 80. Strasse kann man 80"km/h fahren.
auf der 120. Strasse kann man 120 km/h fahren.

Die for Schleife geht jedes Element in der Speedliste durch.
Die if Verzweigung gibt eine Bedingung an: wenn es in der Liste 30 findet, dann gib auf der 0 Straße, darf man 30kmh fahren.
Das gleiche Spiel mit 80 und 120
 */

fun main() {
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    for (i in 0..speedLimits.size - 1) {
        if (speedLimits[i] == 30) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 80) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 120) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    }
}