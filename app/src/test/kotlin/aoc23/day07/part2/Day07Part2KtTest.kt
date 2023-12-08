package aoc23.day07.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day07Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(7)
        day07Part2(input) shouldBe 5905
    }
})
