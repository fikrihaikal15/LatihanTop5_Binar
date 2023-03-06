class Person3(val name : String, val age : Int,
              private val address: String) {
    fun getDetails():String{
        return "Name : $name, Age : $age, Address : $address"
    }
}