package aoc23.day03.ex01

data class Coordinate(val row: Int, val column: Int) {
    fun adjacentCoordinates() =
        (-1..1).flatMap { rowDelta ->
            (-1..1).map { columnDelta ->
                Coordinate(row + rowDelta, column + columnDelta)
            }
        }
            .filterNot { it.column < 0 || it.row < 0 }
}