package Office_Hours.Practice_10_21_2020;


import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender = scan.next();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();


        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter country name");
        String country = scan.nextLine();

        System.out.println("Enter your salary");

        double salary = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter company name");
        String companyName = scan.nextLine();

        System.out.println("Enter your address");
        String address = scan.nextLine();

        System.out.println("you gender is: " + gender);
        System.out.println("Your age is " + age);
        System.out.println("Your full name is " + fullName);
        System.out.println("Your zip code is " + zipcode);
        System.out.println("Your country " + country);
        System.out.println("Your salary " + salary);
        System.out.println("Company name " + companyName);
        System.out.println("Adress " + address);
    }
}
