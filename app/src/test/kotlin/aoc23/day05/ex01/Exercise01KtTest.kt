package aoc23.day05.ex01

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Exercise01KtTest : ShouldSpec({

    should("return 35 for input") {
        val input = getExampleInputForDay(5)
        lowestLocationNumber(input) shouldBe 35
    }
})
