package aoc23.day03.ex01

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Exercise01KtTest : ShouldSpec({

    should("return 4361 for test input") {
        val input = """
            467..114..
            ...*......
            ..35..633.
            ......#...
            617*......
            .....+.58.
            ..592.....
            ......755.
            ...${'$'}.*....
            .664.598..
        """.trimIndent()

        sumOfEnginePartNumbers(input) shouldBe 4361
    }
})
