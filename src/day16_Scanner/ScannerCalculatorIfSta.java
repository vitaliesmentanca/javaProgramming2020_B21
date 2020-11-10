package day16_Scanner;

import java.util.Scanner;

public class ScannerCalculatorIfSta {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a nr");
        double n1= scan.nextDouble();

        System.out.println("enter the math operator");
        char operator=scan.next().charAt(0);

        System.out.println("enter the second nr");
        double n2= scan.nextDouble();

        boolean isValid=operator=='*'|| operator=='/'||operator=='%'
                ||operator=='+'||operator=='-';
        if(isValid){
            if(operator=='*'){
                System.out.println("multiplication is: "+(n1*n2));
            }else if(operator=='/'){
                System.out.println("Division is: "+(n1/n2));
            }else if(operator=='%') {
                System.out.println("Remainder is: " + (n1 % n2));
            } else if(operator=='+') {
                System.out.println("Addition: " + (n1 + n2));
            }else{
                System.out.println("Subtraction"+(n1-n2));
            }


        }else{
            System.err.println("Invalid operator");
        }

    }
}
