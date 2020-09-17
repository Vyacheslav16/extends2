public abstract class geometricFigure {

    //вычисляем площадь фигур с помощью наследования
    open class Trapezoid : geometricFigure() {
        open fun findSquare(a: Int, b: Int, h: Int): Int {
            return (a + b) * h / 2
        }
    }

    open class Sq : geometricFigure() {
        fun findSquare(a: Int, b: Int): Int {
            return a * b
        }
    }

    open class Circle : geometricFigure() {
        fun findSquare(a: Int): Double {
            return 3.14 * a * a
        }
    }

    //вычисляем периметр фигур с помощью перегрузки функций
    class perimetr : geometricFigure() {

        fun perim(a: Int): Double { return (a.toDouble() * 2 * 3.14) } // круг 10

        fun perim(a: Int, b: Int): Int { return (a + b) * 2 } // прямоугольник 10, 5

        fun perim(a: Int, b: Int, c: Int): Int { return (a + b + c) } // треугольник 10, 5, 7

        fun perim(a: Int, b: Int, c: Int, d: Int): Int { return (a + b + c + d) } //трапеция  10, 7, 5, 4
    }
}

fun main(args: Array<String>) {
    println("Площадь круга = ${geometricFigure.Circle().findSquare(6)}")
    println("Площадь прямоугольника = ${geometricFigure.Sq().findSquare(6, 13)}")
    println("Площадь трапеции = ${geometricFigure.Trapezoid().findSquare(8, 18, 5)}")
    println("Периметр круга = ${geometricFigure.perimetr().perim(10)}")
    println("Периметр прямоугольника = ${geometricFigure.perimetr().perim(10, 5)}")
    println("Периметр треугольника = ${geometricFigure.perimetr().perim(10, 5,7)}")
    println("Периметр трапеции = ${geometricFigure.perimetr().perim(10, 7,5,4)}")
}