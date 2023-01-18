fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    // Aufgabe a
    for (i in satz.reversed()) {
        println(i)
    }

    // Aufgabe b
    for (i in satz.size - 2 downTo 0 step 2)
        println(satz[i])

    // Aufgabe c
    for (i in satz.size - 1 downTo 3) {
        println(satz[i])
    }

}

