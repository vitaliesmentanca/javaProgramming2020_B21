package day15_Scanner;

import java.util.Scanner;

public class evenOrOddWithScanner {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter nr");
        int number=in.nextInt();
        if(number%2==0){
            System.out.println(number+"  nr is even");
        }else{
            System.out.println(number+"  nr is odd");
        }


    }
}
