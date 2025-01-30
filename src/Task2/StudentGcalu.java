package Task2;
import java.util.Scanner;

public class StudentGcalu {

    public  static void MarksCalculator(int coursnum){
        Scanner scanner = new Scanner(System.in);
        int courseNumber = coursnum;
        int i = 1,marks=0 , sum=0 ;
        float average;
        while ( i <=courseNumber){
            System.out.println(" Enter marks of 5 course Between (0-100)");
            marks =  scanner.nextInt();
            if(marks >=0 && marks<=100){
                sum = sum + marks;
                //   continue;
            }else {
                System.out.println("Try to enter number between 100 ");
                break;

            }
            i++;
        }
        //
        average =  sum / courseNumber ;
        int avg = Math.round(average);

        System.out.println("the sum is "+ sum +"\tthe avarage is "+average);
        System.out.println("courseNumber\t\tavarage\t\tdescition \t");
        if(avg >=80 && avg<=100){
            System.out.printf("%-10d\t %8d \t\tGRADE A \t",courseNumber,avg);
        }else if (avg >=70 && avg <= 79){
            System.out.printf("%-10d\t %8d \t\t GRADE B \t",courseNumber,avg);
        } else if (avg>=60 && avg <= 69) {
            System.out.printf("%-10d\t %8d \t\tGRADE C\t",courseNumber,avg);
        } else if (avg >=50 && avg <= 59) {
            System.out.printf("%-10d\t %8d \t\t GRADE D\t",courseNumber,avg);
        }else {
            System.out.printf("%-10d\t %8d \t\t Failed ",courseNumber,avg);
        }


    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("HY student Welcome To student Grade Calculator");
            System.out.println("Enter the number of course you have studied");

            int numberCours = scanner.nextInt();
            MarksCalculator(numberCours);

        }catch (Exception e)
        {
          System.out.println("Try to enter number ");

        }




    }

}
