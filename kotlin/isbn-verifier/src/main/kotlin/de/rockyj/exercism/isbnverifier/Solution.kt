package de.rockyj.exercism.isbnverifier

fun isISBN(input: String): Boolean {
    val valid = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "X")
    val listed = input.split("").filter { it != "" }
    val withoutDashes = listed.filter { it != "-" }

    if (!withoutDashes.all { valid.contains(it) }) {
        return false
    }
    if (withoutDashes.contains("X") && withoutDashes.last() != "X") {
        return false
    }
    if (withoutDashes.size != 10) {
        return false
    }

    val summed = withoutDashes
            .map { if (it == "X") "10" else it }
            .mapIndexed { idx: Int, str -> str.toInt() * (10 - idx) }
            .sum()
    return summed.rem(11) == 0
}