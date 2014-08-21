package Week2

object BankAccountClass {
    
  val B1 = new BankAccount                        //> B1  : Week2.BankAccount = Week2.BankAccount@19fe5e6
  B1.deposit(10)
  B1.viewBalance                                  //> res0: Int = 10
  B1.withdraw(8)                                  //> res1: Int = 2
  
  B1.withdraw(8)                                  //> java.lang.Error: insufficient funds!
                                                  //| 	at Week2.BankAccount.withdraw(BankAccount.scala:12)
                                                  //| 	at Week2.BankAccountClass$$anonfun$main$1.apply$mcV$sp(Week2.BankAccount
                                                  //| Class.scala:10)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Week2.BankAccountClass$.main(Week2.BankAccountClass.scala:3)
                                                  //| 	at Week2.BankAccountClass.main(Week2.BankAccountClass.scala)
  
}