package aoc23.day02.ex01

data class CubeSet(val blue: Int, val red: Int, val green: Int) {
    infix fun isSuperSetOf(other: CubeSet) =
        blue >= other.blue && red >= other.red && green >= other.green

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
