package day12_Nestdif;

public class MultiplicationByOddEven {
    public static void main(String[] args) {
/*
        Given 3 numbers (int) and a boolean calculate a number based on these conditions:
        - If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.
        - If the last number is a multiple of 5 divide it by 5, but if the number is not divide it by 2
        - If the given boolean is true:
            - add all the numbers together
            - After adding the numbers if the total value is divisible by 10 evenly then print the number, otherwise print "invalid result"
        - If the given boolean is false:
            - multiple all the numbers together
            - After multiplying the numbers, if the number is odd, then print it, otherwise print "invalid result"
         */

        int numOne = 1;
        int numTwo = 5;
        int numThree = 9;
        boolean check = false;
        int finalResult = 0;

        if (numOne % 2 == 0) {
            numOne *= 5;
        } else {
            numOne *= 10;
        }

        if (numThree % 5 == 0) {
            numThree /= 5;
        } else {
            numThree /= 2;
        }

        if (check) {
            finalResult = numOne + numTwo + numThree;
            if (finalResult % 10 == 0) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        } else {
            finalResult = numOne * numTwo * numThree;
            if (finalResult % 2 == 1) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        }
    }
}
