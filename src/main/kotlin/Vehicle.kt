open class Vehicle(val brand: String , val color:String) {

}
class Car2(brand:String, color:String) : Vehicle(brand,color){
    fun drive():String{
        return "Drive $brand $color"
    }
}
class Motorcycle(brand: String, color: String) : Vehicle(brand,color){
    fun drive():String{
        return "Drive $brand $color"
    }
}