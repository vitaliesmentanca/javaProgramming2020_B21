package AcasaTema;

import java.util.Scanner;

public class LethalCaffeineDose {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numOfMilligrams= scan.nextInt();
        int formula =10*1000/numOfMilligrams;
        System.out.println("It would take about " + formula+" drinks for a lethal overdose.");
    }
}
