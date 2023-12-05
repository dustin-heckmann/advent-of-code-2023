package aoc23.day05.ex02

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import util.getExampleInputForDay

class Exercise02KtTest : ShouldSpec({

    should("return 46 for input") {
        val input = getExampleInputForDay(5)
        lowestLocationNumber(input) shouldBe 46
    }
})
