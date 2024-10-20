// если хотя бы есть один метод абстрактный (без реализации), класс объявляется абстрактным
abstract class Figure(val id: Int, open var x: Int, open var y: Int) : Movable, Transforming {
    // мы не знаем площади абстрактной фигуры, но это не мешает нам определить метод
     abstract fun area(): Float
     abstract fun print()
     override fun move(dx: Int, dy: Int) {
        x+=dx
        y+=dx
     }
}