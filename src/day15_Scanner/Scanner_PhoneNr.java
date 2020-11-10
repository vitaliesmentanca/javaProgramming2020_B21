package day15_Scanner;

import java.util.Scanner;

public class Scanner_PhoneNr {
    public static void main(String[] args) {
        Scanner  info=new Scanner(System.in);
        System.out.println("Enter your age");
        byte age=info.nextByte();
        System.out.println("Enter your phone nr");
        long phonenr=info.nextLong();
        System.out.println("You are student true or false");
        boolean isStudent=info.nextBoolean();


        System.out.println("your age is "+age);
        System.out.println("your phone nr is "+phonenr);
        if(isStudent){
            System.out.println("Great you are student");
        }else{
            System.out.println("youa are  not a student");
        }


    }
}
