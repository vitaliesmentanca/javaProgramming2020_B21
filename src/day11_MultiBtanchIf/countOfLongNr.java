package day11_MultiBtanchIf;

public class countOfLongNr {
    public static void main(String[] args) {
 /*
        Given a number(long) determine and print how many digits it has.
        - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"
        Ex: 124 --> 3 digits
            13213 --> 5 digits
            883218 --> Invalid number
            23 --> 2 digits
         */

        long longNum = 34241;

        if (longNum > 0 && longNum < 10) {
            System.out.println("1 digit");
        } else if (longNum >= 10 && longNum < 100) {
            System.out.println("2 digits");
        } else if (longNum >= 100 && longNum < 1000) {
            System.out.println("3 digits");
        } else if (longNum >= 1000 && longNum < 10000) {
            System.out.println("4 digits");
        } else if (longNum >= 10000 && longNum < 100000) {
            System.out.println("5 digits");
        } else {
            System.out.println("Invalid number");
        }

    }
}
