package AcasaTema;

import java.util.Scanner;

public class SubstringFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        /*if(word.startsWith("x")||word.startsWith("X")){
          word=  word.substring(1,word.length());
        }
        if(word.endsWith("x")||word.endsWith("X")){
            word=word.substring(0,word.length()-1);
        }*/
        ///////////////////////////////////////////////////
        if (word.substring(0,1).equalsIgnoreCase("x")){
            word=word.substring(1);
        }
        if(word.substring(word.length()-1).equalsIgnoreCase("x")){
            word=word.substring(0,word.length()-1);
        }



        System.out.println(word);
    }
}
