package aoc23.day02.ex02

import kotlin.math.max

data class CubeSet(val blue: Int, val red: Int, val green: Int) {
    fun smallestCommonSuperSetWith(other: CubeSet) =
        CubeSet(
            max(blue, other.blue),
            max(red, other.red),
            max(green, other.green),
        )

    fun power() = blue * red * green

    companion object {
        fun fromString(s: String): CubeSet {
            val countsByColor = s.split(", ")
                .map { it.split(" ") }
                .associate { it[1] to it[0].toInt() }
            return CubeSet(
                blue = countsByColor["blue"] ?: 0,
                red = countsByColor["red"] ?: 0,
                green = countsByColor["green"] ?: 0,
            )
        }
    }
}
