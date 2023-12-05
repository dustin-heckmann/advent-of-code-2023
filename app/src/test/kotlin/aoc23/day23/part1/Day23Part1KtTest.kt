package aoc23.day23.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day23Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(23)
        day23Part1(input) shouldBe 0
    }
})

