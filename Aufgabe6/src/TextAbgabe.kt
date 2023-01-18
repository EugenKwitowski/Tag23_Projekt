/*
Schreibe hier deine Antwort hin.
Oh cool, Keanu is auch dabei!
Wie es Michael wohl geht?
Hey Lukas kommt!

Die for Schleife geht die Liste nacheinander durch.
Mit der if bedingung ist erst Lukas dann Keanu dann Michael gegeben, aber in der Liste ist als erster Keanu zu finden
dann Michael dann Likas. Die alle 3 sind in der Liste vorhanden.
 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}