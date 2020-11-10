package AcasaTema;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your item");
        String item = scan.nextLine();
        int balance=100;
        if (item.equals("Smartphone")  || item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            balance -= 15;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("USB cable")) {
            balance -=  10;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Headphones")) {
            balance -= 30;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Pants") ) {
            balance -= 50;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Hat")) {
            balance -= 25;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Socks")) {
            balance -= 5;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Blanket")) {
            balance -= 60;
            System.out.println("Your current balance is: " + balance);
        } else if (item.equals("Pillow")) {
            balance -= 40;
            System.out.println(" Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Invalid item!");
        }



    }
}
