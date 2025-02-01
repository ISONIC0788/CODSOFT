package Task3;
import java.util.Scanner;
public class ATM {
    //with draw option
    public  static int  WithdrawCash(int amaunt){
        int CurrentAmount = amaunt;
        // assighn
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
            case 1:
                System.out.println("you have Choose $40 ");
                if (40<=CurrentAmount){
                    CurrentAmount -= 40;
                    System.out.println(CurrentAmount);
                }else {
                    System.out.println("Un sufficient Amount");
                }

                break;
            case 2 :
                System.out.println("you have choose $60");
                if (60<=CurrentAmount){
                    CurrentAmount -= 60 ;
                    System.out.println(CurrentAmount);
                }else {
                    System.out.println("Un sufficient Amount");
                }
                break;
            case  3 :
                System.out.println("You have choose $80 ");
                if (80<=CurrentAmount){
                    CurrentAmount -= 80;
                    System.out.println(CurrentAmount);
                }else {
                    System.out.println("Un sufficient Amount");
                }

                break;
            case 4:
                System.out.println("you have choose $100");
                if (100<=CurrentAmount){
                    CurrentAmount -= 100;
                    System.out.println(CurrentAmount);
                }else {
                    System.out.println("Un sufficient Amount");
                }
                break;
            case 5:
                System.out.println("Enter the amount$:");
                int inputAmount = scanner.nextInt();
                if (inputAmount<=CurrentAmount){
                    CurrentAmount -= inputAmount;
                    System.out.println(CurrentAmount);
                    System.out.println("The amount you have Entered"+inputAmount );
                }else {
                    System.out.println("Un sufficient Amount");
                }
                break;
            default:
                System.out.println("Ok Im going to prepare another choice ");
        }
        //this return original balance

       return amaunt = CurrentAmount;


    }
    // this function  used to view the balance

    public  static void   CheckBalance(int amount){
        int CurrentAmount = amount;

    }

    //menu option
    public  static  void  MainMenu(){
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

    //deposit function
    public static  int   deposit(int Amount ){
        int  CurrentAmount =Amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select deposit type");
        String[] arrOption= {"Cash","Check"};
        for (int i = 0 ; i < 2 ; i++){
            System.out.printf("%d.%s\n",i,arrOption[i]);
        }
        System.out.println("Enter the option Number");
        int optNumber = scanner.nextInt();
        if (optNumber==0){
            System.out.println("Enter The balance to deposit ");
            int DepositAmount = scanner.nextInt();
            if(DepositAmount>0){
               CurrentAmount += DepositAmount;
            }
        }
//       return Amount+CurrentAmount;
      return CurrentAmount;

    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pin;
        System.out.println("Welcome to Bank [bank name] ATM");
        System.out.println("Please Insert your card");
        System.out.println("Enter your 4-digit PIN:");
        pin = scanner.nextInt();

        // bank Account  detail
        Task3.BankAccount  bankAcc = new Task3.BankAccount();
        int CurrentAmount = bankAcc.amaunt;
 if (pin==123){
     // display detail
      MainMenu();
      System.out.println("Enter number of Option:");
      int option = scanner.nextInt();
      int init = 1;
      do {
          switch (option){
              case 1:
                  bankAcc.amaunt = WithdrawCash(CurrentAmount);
                  System.out.println(bankAcc.amaunt);
                  break;
              case 2:
//              deposit(CurrentAmount);
                  System.out.println(deposit(CurrentAmount));
                  break;
              case 3:
                  System.out.println(bankAcc.userName);
                  System.out.println(bankAcc.AccountNumber);
                  System.out.println(bankAcc.amaunt);
//              CheckBalance(CurrentAmount);
                  break;
              case 4:
                  System.out.println("Hellow to use Contunue ");
              default:
                  System.out.println("Invalid input option ");

          }
          init ++;
      }while (init !=  0);

      }

    }

}
