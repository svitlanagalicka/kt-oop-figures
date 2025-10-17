package mate.academy.service

import mate.academy.figures.Circle
import mate.academy.figures.Square
import mate.academy.figures.Rectangle
import mate.academy.figures.IsoscelesTrapezoid
import mate.academy.figures.RightTriangle
import mate.academy.model.Figure
import mate.academy.model.Color
import kotlin.random.Random

private const val FROM_INDEX = 1.0
private const val TO_INDEX = 10.0
private const val FIGURES_NUMBER = 5
private const val DEFAULT_RADIUS = 10.0
private const val SQUARE_INDEX = 0
private const val RECTANGLE_INDEX = 1
private const val RIGHT_TRIANGLE_INDEX = 2
private const val CIRCLE_INDEX = 3

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(FIGURES_NUMBER)) {
            SQUARE_INDEX -> Square(Random.nextDouble(FROM_INDEX, TO_INDEX), color)
            RECTANGLE_INDEX -> Rectangle(Random.nextDouble(FROM_INDEX, TO_INDEX),
                Random.nextDouble(FROM_INDEX, TO_INDEX), color)
            RIGHT_TRIANGLE_INDEX -> RightTriangle(Random.nextDouble(FROM_INDEX, TO_INDEX),
                Random.nextDouble(FROM_INDEX, TO_INDEX), color)
            CIRCLE_INDEX -> Circle(Random.nextDouble(FROM_INDEX, TO_INDEX), color)
            else -> IsoscelesTrapezoid(Random.nextDouble(FROM_INDEX, TO_INDEX),
                Random.nextDouble(FROM_INDEX, TO_INDEX),
                Random.nextDouble(FROM_INDEX, TO_INDEX), color)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
