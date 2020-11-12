package AcasaTema;

import java.util.Scanner;

public class PrintMiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middleChar=word.length()/2;
        if (word.length()>=5&&word.length()%2==1){
            System.out.println(word.substring(middleChar-1,middleChar+2));
            //System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }
        else {
            System.out.println("invalid");
        }




        
        
        
    }
}
