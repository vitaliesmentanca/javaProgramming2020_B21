package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {
    public static void main(String[] args) {
        Scanner decimal=new Scanner(System.in);//usaly decimal is input name for all
        System.out.println("enter float nr");
        float floatNumber=decimal.nextFloat();
        System.out.println("nr is "+floatNumber);

        System.out.println("enter a double nr");
        double doubleNumber=decimal.nextDouble();
        System.out.println("Number is "+doubleNumber);

        System.out.println(decimal.nextFloat()+decimal.nextDouble());
        //4+4 is equal to 4 sum of 2 nr not concatenation

    }
}
