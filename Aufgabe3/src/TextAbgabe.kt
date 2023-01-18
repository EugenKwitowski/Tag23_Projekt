/*
Schreibe hier deine Antwort hin.
am Montag muss ich arbeiten.
am Dienstag muss ich arbeiten.
am Mittwoch muss ich arbeiten.
am Donnerstag muss ich arbeiten.
am Freitag muss ich arbeiten.
am Samstag hab ich frei.
am Sonntag hab ich frei.

Die for Schleife geht jeden String in der Liste durch.
Die if Verzweigung sagt: wenn es Samstag oder Sonntag ist, dann gib in der Konsole habe ich frei aus.
Die else Verzweigung sagt: sonst muss ich arbeiten.
Da die for Schleife von ersten Element anfängt, gibt sie alle Wochentage der reihe nach aus, mit jeweils ihren bedingungen.
 */

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}