package day15_Scanner;

import java.util.Scanner;

public class Scanner_Boolean {
    public static void main(String[] args) {
        Scanner  expl1=new Scanner(System.in);
        System.out.println("enter true or false");
        boolean b=expl1.nextBoolean();
        System.out.println("Value: "+b);
        System.out.println("Opposite "+!b);

    }
}
