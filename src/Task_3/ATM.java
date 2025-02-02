package Task_3;
import java.util.Scanner;

public class ATM {
  public BankAccount bankAccount;
  // constructor
  public  ATM(BankAccount bankAccount){
      this.bankAccount = bankAccount;
  }

  public void  withdraw(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Amount To with Draw ");
      int DefaultAmount = 20;
      System.out.println("Select Amount To withdraw ");
      for (int i = 1; i <=5  ; i++) {
          DefaultAmount += 20;
          if (i==5){
              System.out.printf("%d.otherAmount\n",i);
          }else {
              System.out.printf("%d.$%d\n",i,DefaultAmount);
          }
      }
      System.out.println("Enter option : ");
      int option  = scanner.nextInt();
      switch (option){
          case  1:
              System.out.println("you have Choose $40 ");
              int amount1 = 40;
              withdraw(amount1);
          break;
          case 2:
              System.out.println("You have choose $60");
              int amount2 = 60;
              withdraw(amount2);
          break;
          case 3:
              System.out.println("You have choose $80");
              int amount3 = 80;
              withdraw(amount3);
              break;
          case 4:
              System.out.println("You have choose $100");
              int amount4 = 100;
              withdraw(amount4);
              break;
          case 5:
              System.out.println("Enter the amount To withdraw: ");
              int amount = scanner.nextInt();
              withdraw(amount);
              break ;
          default:
              System.out.println("Ok Im going to prepare another choice ");
      }


  }

  private  void  withdraw(int amount){
      if (bankAccount.checkBalance()< amount){
          System.out.println("Unnsuffisient ");
      }else
      {
       bankAccount.withDraw(amount);
       System.out.println("Amount Withdraw Successfully");
      }
  }


  public  void  deposit(){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Select deposit type");
      String[] arrOption= {"Cash","Check"};
      for (int i = 0 ; i < 2 ; i++){
          System.out.printf("%d.%s\n",i,arrOption[i]);
      }
      System.out.println("Enter the option Number");
      int optNumber = scanner.nextInt();
      if (optNumber==0){
          System.out.println("Enter the amount to deposit");
          int amount = scanner.nextInt();
          deposit(amount);
      }else {
          System.out.println("Check is no allowed now ");
      }

  }
  private void  deposit(int amount ){
      bankAccount.deposit(amount);
      System.out.println("Successfull money is deposit"+amount);
  }

  //check balance

  public void checkBalance(){
      System.out.println("your Account balance is $"+bankAccount.checkBalance());
  }

  //
  //menu option
  public   void  MainMenu(){
      // main menu learning

      System.out.println("-----------------------------------------------");
      System.out.println("|                main Menu                    |");
      System.out.println("-----------------------------------------------");
      System.out.println("|         please Select an option             |");
      System.out.println("|                1.withdraw Cash              |");
      System.out.println("|                2.Deposit Funds              |");
      System.out.println("|                3.Check balance              |");
      System.out.println("|                4.exit                       |");
      System.out.println("-----------------------------------------------");
  }

    //
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        ATM atm = new ATM(bankAccount);
        atm.MainMenu();
        System.out.println("Welecom to Bank [bank name] ATM");
        System.out.println("Please Enter your Choice");
        int choiceOpt ;
        Scanner scanner = new Scanner(System.in);
        choiceOpt = scanner.nextInt();
        switch (choiceOpt){
            case 1:
                atm.withdraw();
            break;
            case 2:
                atm.deposit();
            break;
            case 3:
                atm.checkBalance();
            break;
            case 4:
            break;
            default:
                System.out.println("Invalid number in option ");
        }

    }
}

