package day18_Strings;

import java.util.Scanner;
import java.util.SortedMap;

public class SubStringMethod2 {
    public static void main(String[] args) {
        String str="Today is Monday";
        //          0123456789
        String day1=str.substring(9);//will give you all word from index 9
        System.out.println(day1);
        System.out.println("-------------------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("First name");
        String firstName=scan.next();//Cybertek
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        //end index is not necessary
        System.out.println("Last name");
        String lastName=scan.next();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName=firstName+' '+lastName;
        System.out.println("Full name is: "+fullName);

    }
}
