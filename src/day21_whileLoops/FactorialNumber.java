package day21_whileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //very limited range
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");

        int num = scan.nextInt();
        int result = 1;
        /*3:3 * 2 * 1
          4:4 * 3 * 2 * 1
          5:5 * 4 * 3 * 2 * 1*/

        for( int i=num;i>=1;i--){
           result*=i;
        }
        System.out.println("result = " + result);
    }
}
