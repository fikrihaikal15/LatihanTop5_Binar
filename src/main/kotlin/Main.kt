fun main(args: Array<String>) {
    //1
    val introduce = Person("Haikal", 21)
    introduce.introduce()
    //2
    val hitungLuas = Rectangle(100.0,100.0)
    println(hitungLuas.getArea())

    //3
    val Anjing = Animal("Anjing","guk")
    Anjing.makeSound()

    //4
    val mobil = Car("Honda","Yaris", 2023)
    mobil.startEngine()

    //5
    val akun = BankAccount(100000.0)
    println("Saldo saat ini : ${akun.balance}")

    akun.deposit(500000.0)
    println("Saldo saat ini : ${akun.balance}")

    akun.withdraw(250000.0)
    println("Saldo saat ini : ${akun.balance}")

    //6
    val student = Student("Haikal",21,"AND 1", 100.0)
    println(student.getDetails())

    //7
    val cat = Cat("Piu", "Male")
    val dog = Dog("Bruno","Male")
    println("${cat.name} bersuara ${cat.makeSound()}")
    println("${dog.name} bersuara ${dog.makeSound()}")

    //8
    val car2 = Car2("Honda", "White")
    val motorcycle = Motorcycle("Honda", "Red")
    println(car2.drive())
    println(motorcycle.drive())

    //9
    val rectangle = Rectangle2(150.0,200.0)
    val square = Square(100.0,100.0)
    println("Luas persegi panjang : ${rectangle.getArea()}")
    println("Luas persegi : ${square.getArea()}")

    //10
    val user = User("Haikal", "123456")
    //nilai true
    println(user.login("Haikal","123456"))
    //nilai false
    println(user.login("fikri","123"))

    //11
    val person3 = Person3("Fikri Haikal",21,"Bekasi")
    println(person3.getDetails())
}