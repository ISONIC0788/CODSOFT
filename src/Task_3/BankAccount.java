package Task_3;
public class BankAccount {
    ///
    private  int balance;

    //
    public  BankAccount(int balance){
       this.balance = balance;
    }

    // with draw cach
    public  void  withDraw (int amount){
        if (balance< amount){
//            
        }
        balance -= amount;
    }

    // deposit amount

    public  void  deposit(int amount){
        if (amount>0){
            balance += amount;
        }else {
            System.out.println("Invalid amaount ");
        }
      }
      // to show main balance
      public int checkBalance(){
        return  balance;
      }
}
