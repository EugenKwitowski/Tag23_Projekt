/*
Schreibe hier deine Antwort hin.
Das Buch an der Stelle 0 ist Harry Potter.
Das Buch an der Stelle 1 ist Herr der Ringe.
Das Buch an der Stelle 2 ist Dune.
Das Buch an der Stelle 3 ist Eragon.
Daswaren alle Bücher

Die Laufvariable geht die Liste index für index durch. Von ersten String bis zum letzten String.
Ung gibt sie alle untereinande in der Konsole aus. Die val book = books[i] zeigt die Stelle an,
in welchen index sich jeder Film befindet.
 */

fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}