open class Shape(val length : Double, val widht : Double) {
}
class Rectangle2(length : Double, widht : Double) : Shape(length,widht){
    fun getArea():Double{
        return length * widht
    }
}

class Square(length : Double, widht : Double) : Shape(length,widht){
    fun getArea():Double{
        return length * widht
    }

}