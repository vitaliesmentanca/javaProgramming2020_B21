package day18_Strings;

import java.util.Scanner;

public class Substring_UppLowercase {
    public static void main(String[] args) {

        String str = "today is Monday";
        //            0123456789    14
        String day = str.substring(9, 15);//exclude the last index
        System.out.println(day);

        String email = "cybertek@gmail.com";
        //              0123456789   13
        String domain = email.substring(9, 14);//14 -->13+1
        System.out.println("domain of the email: " + email + " is " + domain);

        System.out.println("--------------------");

        String s1 = "I like movies and books";
        String word1 = s1.substring(7, 13);
        System.out.println(word1);
        System.out.println("-------------------------");

        String firstName="mArWaN";//Marwan
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length() ).toLowerCase()  ;

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;

        System.out.println(firstName);
        System.out.println("---------------------");
         /*
    ask the user to enter first and last names, then print out the full name
            input:
                cYbErTeK
                sCHOOL
            output:
                Cybertek School
     */
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()  +  f.substring(1, f.length()-1 +1 ).toLowerCase() ;

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l =  l.substring(0, 1).toUpperCase() + l.substring(1, l.length()).toLowerCase();

        System.out.println("first name is: "+f);
        System.out.println("last name is: "+l);

        String fullName = f + " " + l;

        System.out.println("full name is: "+fullName);

    }
}
