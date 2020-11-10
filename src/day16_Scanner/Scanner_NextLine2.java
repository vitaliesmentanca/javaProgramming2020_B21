package day16_Scanner;
import java.util.Scanner;
public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age=input.nextInt();

        System.out.println("enter your phone nr");
        long phoneNum= input.nextLong();

        input.nextLine();//the purpose of this to accept the enter key
        //if you don't put the nextline ,full name will not be able to store kind of skip,going to next line
                        //
        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("name "+fullName);
        System.out.println("age "+age);
        System.out.println("Your phone nr is "+phoneNum);
    }
}
