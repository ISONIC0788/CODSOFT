package Task3;
import java.util.Scanner;
public class ATM {
	//with draw option 
	   public  static void WithdrawCash(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Amount To with Draw ");
	        int AmountNum = 20;
	        System.out.println("Select Amount To withdraw ");
	        for (int i = 1; i <=5  ; i++) {
	            AmountNum += 20;
	            if (i==5){
	                System.out.printf("%d.otherAmount\n",i);
	            }else {
	                System.out.printf("%d.$%d\n",i,AmountNum);
	            }


	        }
	        System.out.println("Enter option : ");
	        int option  = scanner.nextInt();
	        switch (option){
	            case 1:
	                System.out.println("you have Choose $40 ");
	            break;
	            case 2 :
	                System.out.println("you have choose $60");
	            break;
	            case  3 :
	                System.out.println("You have choose $80 ");
	            break;
	            case 4:
	                System.out.println("you have choose $100");
	            break;
	            case 5:
	                System.out.println("Enter the amount$:");
	                int amount = scanner.nextInt();
	                System.out.println("The amount you have Entered"+amount);
	            break;
	            default:
	                System.out.println("Ok Im going to prepare another choice ");
	        }
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
	public static  void  deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select deposit type");
        String[] arrOption= {"Cash","Check"};
        for (int i = 0 ; i < 2 ; i++){
            System.out.printf("%d.%s\n",i,arrOption[i]);
        }
        System.out.println("Enter the option Number");
        int optNumber = scanner.nextInt();
        if (optNumber==1){
            System.out.println("Enter The balance to deposit ");
            int amount = scanner.nextInt();
        }

}
	
	
	public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pin;
        System.out.println("Welcome to Bank [bank name] ATM");
        System.out.println("Please Insert your card");
        System.out.println("Enter your 4-digit PIN:");
        pin = scanner.nextInt();
        if (pin==123){
          System.out.println("you have passed ");
        }

      WithdrawCash();
//        deposit();

    }

}
