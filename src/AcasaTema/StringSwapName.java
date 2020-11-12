package AcasaTema;

import java.util.Scanner;

public class StringSwapName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName="";
        String lastName="";
        String entireEmail="";
        if (email.contains("_")){
         firstName=email.substring(email.indexOf(0)+1,email.indexOf("_"));
         lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        entireEmail=lastName+"_"+firstName+email.substring(email.indexOf("@"));
            System.out.println(  entireEmail);
        }else{
            System.out.println(email );
        }



    }
}
