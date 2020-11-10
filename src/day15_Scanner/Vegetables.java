package day15_Scanner;

import java.util.Scanner;

public class Vegetables {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price");
        String Item1=scan.next();
        double price1=scan.nextDouble();

        System.out.println("Enter Item2 and its price");
        String Item2=scan.next();
        double price2=scan.nextDouble();

        System.out.println("Enter Item3 and its price");
        String Item3=scan.next();
        double price3=scan.nextDouble();
        String report="";
        report="Item1: "+Item1+" Price: "+price1+","+" Item2: "+Item2+" Price: "+price2+","+"Item3: "+Item3+" Price: "+price3;

        double totalPrice=price1+price2+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
    }
}
