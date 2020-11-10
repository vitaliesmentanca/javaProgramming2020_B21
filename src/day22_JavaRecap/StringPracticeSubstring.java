package day22_JavaRecap;

import sun.awt.AWTAccessor;

import java.util.Scanner;

public class StringPracticeSubstring {
    public static void main(String[] args) {
        
        String sentence="My name is cybertek";
        String name1=sentence.substring(11,sentence.length());
        System.out.println("name1 = " + name1);

        String name2=sentence.substring(11);
        System.out.println("name2 = " + name2);

        String str1="Monday is cool,it's a fun day";
        String day1=str1.substring(0,6);
        System.out.println("day1 = " + day1);
        String day2=str1.substring(0,str1.indexOf("c"/*cool*/));//return index witch you want
        System.out.println("day2 = " + day2);
        
        String s1="https://www.amazon.com";
        String domain=s1.substring(s1.lastIndexOf(".")+1);
        System.out.println("domain = " + domain);
        String s2="Java is fun, and cool";
        String name=s2.substring(s2.indexOf("f"),s2.lastIndexOf(","));//de la virgula pina la f
        System.out.println("name = " + name);
       name = name.substring(0,1).toUpperCase()+name.substring(1);//cu litera mare si luam din cela modificat name
        System.out.println("name = " + name);

        System.out.println("======================================");
        
        Scanner scan =new Scanner(System.in);
        String firstName= scan.next().toLowerCase().replace(" ","");
        String lastName= scan.next().toLowerCase().replace(" ","");
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);

        scan.close();



    }
}
