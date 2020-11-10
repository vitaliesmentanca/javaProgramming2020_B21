package AcasaTema;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();
        int remainder, change, quarters, dimes, nickels,remainder2 = 0;

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else {
            change = 100 - itemPrice;
            quarters = change / 25;//2
            remainder = change % 25;//15
            dimes = remainder / 10;//1
            remainder2= remainder % 10;
            nickels=remainder2/5;
            System.out.println("Your change is " + quarters + " quarters," + dimes + " dimes, and " + nickels + " nickels.");
        }


    }
}
