package week2;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Employe name: ");
    String EmpName = in.nextLine();
    System.out.println("Number of hours worked: ");
    Double hours = in.nextDouble();
    System.out.println("Hourly Pay: ");
    Double HourlyRate = in.nextDouble();
    System.out.println("Fedral Tax WithHolding: ");
    Double FedTax = in.nextDouble();
    System.out.println("State Tax: ");
    Double StateTax = in.nextDouble();



    System.out.println("Hours Worked : " + hours);
    System.out.println("Pay Rate : " + HourlyRate);
    System.out.println("Gross Pay: " + hours * HourlyRate);
    System.out.println("Deductions: ");
    Double FedtaxCal= (hours*HourlyRate)* FedTax / 100;  
    System.out.println("       Fedral Withholding ("+ FedTax+") : $"+ FedtaxCal);
    Double StateTaxCal= (hours*HourlyRate)* StateTax / 100;  
    System.out.println("       Fedral Withholding ("+ FedTax+") : $"+ StateTaxCal);
    Double tax = StateTaxCal+FedtaxCal;
    System.out.println("       Total Deductions : $" + tax);

    System.out.println("Net Pay : " + ((hours*HourlyRate) - tax));






    }
    
}
