package day18_Strings;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first word");
        String s1=scan.next();//one word

        System.out.println("enter the second word");
        String s2= scan.next();

        System.out.println("enter the third word");
        String s3= scan.next();

        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();

        if(l1==l2&&l1==l3){
            System.out.println("All words are equals");
        }else if(l1==l2||l1==l3||l2==l3){
            System.out.println("Not same nor Different lengths");
        }else {
            System.out.println("All are different length");
        }

    }
}
/*
4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */