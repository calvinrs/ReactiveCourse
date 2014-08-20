package Week2

object BankAccountClass {
  class BankAccount {
  	private var balance = 0
  	def deposit(amount: Int): Unit = {
  		if (amount > 0) balance = balance + amount
  	}
  	def withdraw(amount:Int):Int =
  		if (0 < amount && balance - amount >= 0) {
  			balance = balance - amount
  			balance
  		} else throw new Error("insufficient funds!")
  	def viewBalance: Int = balance
  }
  
  val B1 = new BankAccount                        //> B1  : Week2.BankAccountClass.BankAccount = Week2.BankAccountClass$BankAccoun
                                                  //| t@5f3bad
  B1.deposit(10)
  B1.viewBalance                                  //> res0: Int = 10
  B1.withdraw(8)                                  //> res1: Int = 2
  
  
}