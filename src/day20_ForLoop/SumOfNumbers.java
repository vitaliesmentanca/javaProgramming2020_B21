package day20_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number ");
        int num= scan.nextInt();//100
        int result=0;
        if(num>=1){
            for(int i=1;i<=num;i++){
                result+=i;
            }   System.out.println("sum " + result);
        }else{
            System.err.println("Invalid entry");
        }



    }
}
