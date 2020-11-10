package day21_whileLoops;

import java.util.Scanner;

public class LoopOddEvenNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=1;i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("====================================");
        for(int i=1;i<=50;i++){//even
            if(i%2 !=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=======================");
        for(int i=1;i<=50;i++){
            if(i%3 !=0){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
