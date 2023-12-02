package aoc23.day01.ex01

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Exercise01KtTest : ShouldSpec({
    should("return 142 for example input") {
        val input = """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet
        """.trimIndent()

        calibrationValuesSum(input) shouldBe 142
    }
})
