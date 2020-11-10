package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnterNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Enter a number");
        int n1 = scan.nextInt();
        System.out.println("Enter a number");
        int n2 = scan.nextInt();
        System.out.println("Enter a number");
        int n3 = scan.nextInt();
        System.out.println("Enter a number");
        int n4 = scan.nextInt();
        System.out.println("Enter a number");
        int n5 = scan.nextInt();
        int result = n1 + n2 + n3 + n4 + n5;
        System.out.println("Sum " + result);*/
        System.out.println("Enter how many times  you want to enter nr" );
        int result = 0;
        int times = scan.nextInt();//how many number user wants to enter

        for (int i = 1; i <= times; i++) {
            System.out.println("Enter a number "+i/*you will see on console how many times user input nr*/);
            result = result + scan.nextInt();// is a loop it will wait to enter number 5 times
        }          //result+=scan.nextInt()
        System.out.println("Sum" + result);


    }
}
