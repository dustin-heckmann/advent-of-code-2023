package aoc23.day07.part1

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Day07Part1KtTest : ShouldSpec({
    should("should return correct value for example") {
        val input = getExampleInputForDay(7)
        day07Part1(input) shouldBe 0
    }
})

