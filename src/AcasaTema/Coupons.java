package AcasaTema;

import java.util.Scanner;

public class Coupons {
    public static void main(String[] args) {
        //Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
       int coupons = scan.nextInt();

       if(coupons<3){
           System.out.println("Not enough coupons");
       }else{
           int candy=coupons/10;
           int remainder=coupons%10;
           int  gumball=remainder/3;

           System.out.println("Number of Candies: "+candy);
           System.out.println("Number of Gumballs: "+gumball);



       }





    }
}