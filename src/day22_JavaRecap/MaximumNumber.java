package day22_JavaRecap;

import java.util.Scanner;
//maximum nr between numbers
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int max =-2147483648;
        for(int i=1;i<=5;i++){
            System.out.println("Enter a number  ");
            int n =scan.nextInt();
            if(n>max){
                max=n;
            }
        }
        scan.close();
        System.out.println("max = " + max);
    }
}
