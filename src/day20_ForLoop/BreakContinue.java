package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {


        for(int i=0;i==0;){
            Scanner scan= new Scanner(System.in);
            System.out.println("enter two numbers");
            int n1= scan.nextInt();
            int n2= scan.nextInt();
            System.out.println("Enter the math operator");
           /* char op=scan.next().charAt();
            switch (op){
                case'+':
                    System.out.println(n1+n2);

            }*/

            System.out.println("Sum is: "+(n1+n2));
            System.out.println("would you like to continue?Yes,No ");
            String answer= scan.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println("goodbye");
                break;
            }
        }



    }
}
