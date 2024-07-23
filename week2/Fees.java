package week2;
import java.util.Scanner;

public class Fees {
    public static void main(String[] args) {
        int athleticFees= 65;
        int PerCreditHour= 85; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of hours enrolled: ");
        int EnrolledHours= in.nextInt();
        System.out.println("amount spent on books: ");
        double spentBooks= in.nextDouble();
        double calc = (PerCreditHour * EnrolledHours) + athleticFees+ spentBooks;
        System.out.println("Hours enroller: "+ EnrolledHours + " amount spent on books : "+spentBooks + " athletic fees: "+athleticFees + " total amount: " + calc);
    

    }

}

