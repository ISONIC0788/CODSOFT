package Task1;
import java.util.Random;
import java.util.Scanner;


public class NumberGame {

    public static void generateNumber(int mynumber ){

        int inputNumber = mynumber;
        Random random = new Random();

        int score = 0 ;

        int number = random.nextInt(0,100); // random boundary from 0 - 100

        if (inputNumber == number){
            // check if number is correct
            System.out.println("This number is correct");
            score +=3;
        }else {
            // check if number is greater than or less than  the number that are generated
            if(inputNumber>number){
                System.out.println("The number is too high\" Try another chance\"");
                System.out.println("The correct number is:"+number);
                System.out.println("Your Score is "+ score);
            }else {
                System.out.println("The number is too low \" Try another chance\"");
                System.out.println("The correct number is:"+number);
                System.out.println("Your Score is "+ score);
            }
        }
    }
    public static void main(String[] args) {

        try{

            Scanner scanner = new Scanner(System.in);
            int attemptNumber = 1;
            while (attemptNumber<=7){

                System.out.println("Hellow Enter the guess for generated number from (1 - 100): ");
                int inputNumber = scanner.nextInt();

                generateNumber(inputNumber); // function call to check whether inputed  number

                attemptNumber++;

            }

            System.out.println("Your Attemp Number is:"+(attemptNumber-1));
            System.out.println(" if you want to continue other two Attempt (Yes(Y) or no(N)) ");
            scanner.nextLine();
            String attempt =  scanner.nextLine();
            if (attempt.equalsIgnoreCase("y")){

                    System.out.println("Hellow Enter the guess for generated number from (1 - 100): ");
                    int inputNumber = scanner.nextInt();

                    generateNumber(inputNumber); // function call to check whether inputed  number

            }
            scanner.close();



        }catch (Exception e){

             System.out.println("Try To enter Number ");
        }


    }
	

}
