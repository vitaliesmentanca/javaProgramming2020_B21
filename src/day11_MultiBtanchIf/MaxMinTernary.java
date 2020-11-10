package day11_MultiBtanchIf;

public class MaxMinTernary {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        int max1 = 0;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        System.out.println(max1);
        System.out.println("========================");
        int max2 = (a > b) ? a : b;
        System.out.println(max2);
        System.out.println("========================");
        int min1 = 0;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        System.out.println("min nr is " + min1);
        int min2 = (a < b) ? a : b;
        System.out.println("min nr is "+min2);
    }
}
