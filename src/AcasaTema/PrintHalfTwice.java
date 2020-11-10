package AcasaTema;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int halfWord=word.length()/2;
        String result=word.substring(0,halfWord);
        System.out.println(result+ result);
    }
}
