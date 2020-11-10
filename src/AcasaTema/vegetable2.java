package AcasaTema;

import java.util.Scanner;

public class vegetable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double totalPrice = count1*price1 + count2*price2 + count3*price3;



        if(count1>0&&count2>0&&count3>0){
            System.out.println("Total price: " + totalPrice);
        }

        String report = "Item1: " + item1 +" Price: " + price1*count1 + ", " +
                ((count2>0)?"Item2: " + item2 + " Price: "+ price2*count2 :
                        "Item3: " + item3 + " Price: " + price3*count3);

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);

    }
}
