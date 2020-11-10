package AcasaTema;

import java.util.Scanner;

public class PrintFirstLastChar {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
    }
}
