package aoc23.day23.part2

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day23Part2KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(23)
        day23Part2(input) shouldBe 0
    }
})

