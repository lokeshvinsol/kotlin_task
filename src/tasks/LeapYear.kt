package tasks

fun main() {
    println(checkForLeapYear(year = 2100))
}

fun checkForLeapYear(year: Int) = if (((year % 4 == 0) && (year % 100 != 0)) ||
    (year % 400 == 0))
    "This is leap year"
else "This is not a leap year"
