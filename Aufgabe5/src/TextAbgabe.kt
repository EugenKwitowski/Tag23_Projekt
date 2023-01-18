/*
Schreibe hier deine Antwort hin.
1. Eine MutableList mit 4 Strigs angelegt worden
2. Eine Variable mit String Erdbeere, die es in MutableList nicht gibt, erstell worden.
3. Die for Schleife hat Iterator, der abzählt den index in der Liste von 3 bis 0.
   Also das letzte Element bis zum ersten.
4. if Verweigung gibt eine bedingung an: wenn in der Liste Banane gibt, und verändere die Variable Erdbeere zu Banane
   und gib inder Konsole liebligsfrucht als Banane aus
 */

fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
            //fruechteListe[i] = "Erbeere"  // Selbstexperement  Erdbeere durch Banane ersetzt
        }
        //fruechteListe[i] = "Erbeere"       // Selbstexperement ganze Liste durch Erdbeere ersetzt
    }
    println(lieblingsFrucht)
}