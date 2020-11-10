package day11_MultiBtanchIf;

public class UpperCase_LowerCase {
    public static void main(String[] args) {
         /*
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter
        Ex: 'b'  --> lowercase
            'G'  --> uppercase
            'O'  --> uppercase
        */
        char letter = 'A';

        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + " is uppercase");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " is lowercase");
        } else {
            System.out.println("Not a valid letter");
        }


    }
}
