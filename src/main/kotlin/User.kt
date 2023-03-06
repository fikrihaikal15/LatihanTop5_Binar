class User(private var username:String,
           private var password:String) {
    fun login(username2 : String, password2: String):Boolean{
        return username2 == username && password2 == password
    }
}