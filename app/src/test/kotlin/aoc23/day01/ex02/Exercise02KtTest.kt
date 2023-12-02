package aoc23.day01.ex02

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Exercise02KtTest : ShouldSpec({
    should("return 281 for example input") {
        val input = """
            two1nine
            eightwothree
            abcone2threexyz
            xtwone3four
            4nineeightseven2
            zoneight234
            7pqrstsixteen
        """.trimIndent()

        calibrationValuesSum(input) shouldBe 281
    }
})
