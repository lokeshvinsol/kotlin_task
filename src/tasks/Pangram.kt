package tasks

val mark = BooleanArray(26)
fun main() {
    val str = "AbcDefGhiJkLmnOpqrstuvwXy"
    println("$str ${checkPangram(str)}")
}

fun checkPangram(str: String): String {
    for (i in 0 until str.length) {
        when (str[i]) {
            in 'A'..'Z' -> mark[str[i] - 'A'] = true
            in 'a'..'z' -> mark[str[i] - 'a'] = true
        }
    }

    when {
        mark.contains(false) -> return "is not a Panagram"
        else -> return "is a Panagram"
    }
}
