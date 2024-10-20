// TODO: дополнить определение класса размерами и позицией
class Circle(override var x: Int, override var y: Int, var r: Int) : Figure(1, x, y) {
    // TODO: реализовать интерфейс Transforming
    override fun area(): Float {
        return  (r*r*Math.PI).toFloat();
    }

    override fun resize(zoom: Int) {
        r*=zoom
    }

    override fun move(dx: Int, dy: Int) {
        x+=dx
        y+=dx
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val new_x: Int = x - centerX
        val new_y: Int = y - centerY
        if (direction.clockwise) {
            x= centerX+new_y
            y= centerY-new_x
        } else {
            x= centerX-new_y
            y= centerY+new_x
        }
    }

    override fun print(){
        println("I am circle with radius $r and center ($x, $y)")
    }
}