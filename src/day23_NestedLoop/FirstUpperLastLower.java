package day23_NestedLoop;
/*
2.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */

public class FirstUpperLastLower {
    public static void main(String[] args) {
        String str="Cybertek";
        char f=str.charAt(0);
        char l=str.charAt(str.length()-1);
        boolean start=f>=65&&f<=90;//ascii table
        boolean end = l >= 97 && l <= 122;  // false

        if(start && end){ // true && false
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
