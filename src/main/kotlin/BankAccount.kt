class BankAccount(var balance : Double) {
    fun deposit(amount:Double){
        balance += amount
    }
    fun withdraw(amount :Double){
        if(balance >= amount){
            balance -= amount
        }else{
            println("Saldo dana tidak cukup")
        }
    }
}