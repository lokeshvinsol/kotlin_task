package tasks

val mark = BooleanArray(26)
fun main() {
    val str = "AbcDefGhiJkLmnOpqrstuvwXyZ"
    println("$str ${checkPangram(str)}")
}

fun checkPangram(str: String): String {
    for (char in str) {
        when (char) {
            in 'A'..'Z' -> mark[char - 'A'] = true
            in 'a'..'z' -> mark[char - 'a'] = true
        }
    }
    if (mark.contains(false))
        return "is not a Panagram"
    return "is a Panagram"
}
