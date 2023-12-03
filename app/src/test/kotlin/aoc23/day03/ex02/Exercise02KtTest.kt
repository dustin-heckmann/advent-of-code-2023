package aoc23.day03.ex02

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Exercise02KtTest : ShouldSpec({

    should("return 467835 for test input") {
        val input = """
            467..114..
            ...*......
            ..35..633.
            ......#...
            617*......
            .....+.58.
            ..592.....
            ......755.
            ...\$.*....
            .664.598..
        """.trimIndent()

        sumOfGearRatios(input) shouldBe 467835
    }
})
