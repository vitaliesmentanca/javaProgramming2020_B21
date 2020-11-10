package AcasaTema;

import java.util.Scanner;

public class ContainMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
       // ANOTHER METHOD:   boolean result=sentence.contains(word);
      //                    sSystem.out.println(result);
        System.out.println(sentence.contains(word));






    }
}
