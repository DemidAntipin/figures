// TODO: дополнить определение класса размерами и позицией
class Square(override var x: Int, override var y: Int, var width: Int) : Figure(3, x, y) {
    // TODO: унаследовать от Figure, реализовать area()
    override fun area(): Float {
        return (width * width).toFloat()
    }

    override fun resize(zoom: Int) {
        width *= zoom
    }

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
    }

    override fun print(){
        println("I am square with width $width and keypoint ($x, $y)")
    }
}