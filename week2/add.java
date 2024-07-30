package week2;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1 = in.nextInt();
        
        System.out.println("Enter Second number : ");
        int num2 = in.nextInt();


        System.out.println("1st number is as " + num1 + " 2nd number is as: "+ num2 + " total of " + num1 + " + " +num2+" = " + (num1+num2));

    }

}

