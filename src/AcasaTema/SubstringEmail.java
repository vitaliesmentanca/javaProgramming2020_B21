package AcasaTema;

import java.util.Scanner;

public class SubstringEmail {
    public static void main(String[] args) {//craig_federighi@apple.com
        Scanner scan=new Scanner(System.in);
        String email = scan.next();
        String firstName=email.substring(0,email.lastIndexOf("_"));
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String lastName=email.substring(email.indexOf("_")+1,email.lastIndexOf("@"));
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        String topDomain=email.substring(email.indexOf(".")+1);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: "+topDomain);

    }
}
