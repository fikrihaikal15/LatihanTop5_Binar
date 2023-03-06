open class Animal2(val name: String, val gender: String) {

}
class Cat(name: String, gender: String) : Animal2(name,gender){
    fun makeSound() : String{
        return  "Meow!"
    }
}
class Dog(name: String, gender: String) : Animal2(name,gender){
    fun makeSound():String{
        return "Guguk!"
    }
}