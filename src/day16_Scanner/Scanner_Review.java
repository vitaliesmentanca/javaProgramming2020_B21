package day16_Scanner;

import java.util.Scanner;// between the package and class p.i.c.

public class Scanner_Review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//make the scanner object
        System.out.println("pick nr from 1-10");
        byte num = input.nextByte();//accept one byte value
        if (num > 0 && num < 11) {


            System.out.println("can you enter number as a word");
            String word = input.next();//accept word
            boolean areMatching = false;
            switch (word) {
                case "one":
                    areMatching = (num == 1);
                    break;
                case "two":
                    areMatching = (num == 2);
                    break;
                case "three":
                    areMatching = num == 3;//se poate si fara paranteze
                    break;
                //cases 4 to 10
            }

            if (areMatching) {
                System.out.println("number: " + num);
                System.out.println("word " + word);
            } else {
                System.out.println("the all inputs do not match");
            }

        } else {
            System.out.println(num + " invalid nr not between 1-10");
        }
        input.close();//cosolul nu mai cere

    }
}
