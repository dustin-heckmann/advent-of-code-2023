package aoc23.day03.ex02

data class Coordinate(val rowIndex: Int, val columnIndex: Int) {
    fun adjacentCoordinates() =
        (-1..1).flatMap { rowDelta ->
            (-1..1).map { columnDelta ->
                Coordinate(rowIndex + rowDelta, columnIndex + columnDelta)
            }
        }
            .filterNot { it == this }
            .filterNot { it.columnIndex < 0 || it.rowIndex < 0 }
}
