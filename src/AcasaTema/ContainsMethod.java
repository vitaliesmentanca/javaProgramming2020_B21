package AcasaTema;

import java.util.Scanner;

public class ContainsMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here

        boolean valid=(a.contains("alejandro"));
        if(valid){System.out.println("read this mail");}
        else { System.out.println("dont read"); }
    }
}
