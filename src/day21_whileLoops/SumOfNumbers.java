package day21_whileLoops;

import java.util.Scanner;
/*
SumOfNumbers
	1.  Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
			hint: you need an infinite loop
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int result=0;
        
        for(int i=0;i<1;){
            System.out.println("Enter a number");
            int num=scan.nextInt();//5 +10=15 15+5=20....
            if (num<0){
                break;
            }
            result+=num;

        }
        scan.close();
        System.out.println("result = " + result);
        
    }
}
