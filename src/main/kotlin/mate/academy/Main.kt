package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val TIMES = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    repeat(TIMES) { figures.add(figureSupplier.getRandomFigure()) }
    repeat(TIMES) { figures.add(figureSupplier.getDefaultFigure()) }

    figures.forEach { it.draw() }
}
