// сочетание определения класса и конструктора одновременно объявляет переменные и задаёт их значения
class Rect(override var x: Int, override var y: Int, var width: Int, var height: Int) : Figure(0, x ,y) {
    // TODO: реализовать интерфейс Transforming
    var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    lateinit var name: String // значение на момент определения неизвестно (только для объектных типов)
    // дополнительный конструктор вызывает основной
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val new_x: Int = x - centerX
        val new_y: Int = y - centerY
        if (direction.clockwise) {
            x= (centerX+new_y) - width
            y= centerY-new_x
        } else {
            x= centerX-new_y
            y= (centerY+new_x) + width
        }
        val s=width
        width=height
        height=s
    }

    override fun resize(zoom: Int) {
        width*=zoom
        height*=zoom
    }
    // для каждого класса area() определяется по-своему
    override fun area(): Float {
        return (width*height).toFloat() // требуется явное приведение к вещественному числу
    }

    override fun print(){
        println("I am rect with width $width, height $height and keypoint ($x, $y)")
    }
}