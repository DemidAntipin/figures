fun main() {

    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)
    // переменной базового класса
    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(1,0,5)

    f2.print()
    f2.rotate(RotateDirection.Clockwise, 0, 0)
    f2.print()

    f2.resize(2)
    f2.print()

    f2.move(5,5)
    f2.print()

    val f3: Figure = Square(2,-6,6)
    f3.print()
    f3.rotate(RotateDirection.CounterClockwise, 8, 5)
    f3.print()

    val f4: Figure = Rect(2,4, 4,2)
    f4.print()
    f4.rotate(RotateDirection.Clockwise, 3,-3)
    f4.print()
    f4.rotate(RotateDirection.CounterClockwise, 3,-3)
    f4.rotate(RotateDirection.CounterClockwise, 3,-3)
    f4.print()
}