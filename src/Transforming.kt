interface Transforming {
    fun resize(zoom: Int)
    // TODO: величивает фигуру, не перемещая, с сохранением пропорций

    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
    // TODO: поворот фигуры вокруг точки (centerX, centerY) на 90 градусов
}

enum class RotateDirection(val clockwise: Boolean) {
    Clockwise(true),
    CounterClockwise(false)
}
