package aoc23.day01.ex02

import util.readResourceFile

val wordsToDigits = mapOf(
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
    "five" to 5,
    "six" to 6,
    "seven" to 7,
    "eight" to 8,
    "nine" to 9,
)

fun calibrationValuesSum(input: String) =
    input
        .lines()
        .sumOf { 10 * findFirstDigit(it) + findLastDigit(it) }

fun findFirstDigit(line: String) = findDigitInStringWithTransformation(line) { it }

fun findLastDigit(line: String) = findDigitInStringWithTransformation(line) { it.reversed() }

fun findDigitInStringWithTransformation(line: String, transform: (String) -> String): Int {
    val digit = wordsToDigits.keys
        .map(transform)
        .plus("\\d")
        .toOrGroupRegex()
        .find(transform(line))!!
        .value

    return when (digit.toIntOrNull()) {
        null -> wordsToDigits[transform(digit)]!!
        else -> digit.toInt()
    }
}

fun List<String>.toOrGroupRegex() = joinToString("|", "(", ")").toRegex()

fun main() {
    val input = readResourceFile("/day01/input.txt")
    val result = calibrationValuesSum(input)
    println(result)
}
