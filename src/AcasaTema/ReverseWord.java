package AcasaTema;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scan.nextLine();
        int wordCount = word.length();
        String result = "";
        if (wordCount < 5) {
            System.out.println("Too short!");
        } else if (wordCount == 5) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);

            }System.out.println("result = " + result);
        } else {
            System.out.println("Too long!");
        }



    }
}
