package AcasaTema;

;

import java.util.Scanner;

public class PrintMiddleChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word= scan.next();
        int wordCount=word.length();
        int middleChar=wordCount/2;
        if(wordCount>=3&&wordCount%2!=0){
            System.out.println(word.charAt(wordCount/2));
        }else if(wordCount==1){
            System.out.println(word+word+word);
        }else if (wordCount>=4&&wordCount%2==0){
            System.out.println(word.charAt(middleChar-1)+""+word.charAt(middleChar));
        }else {
            System.out.println(word+word);
        }

    }
}
