package AcasaTema;

import java.util.Scanner;

public class Citizens036 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens= scan.nextInt();
        int nonSeniorCitizen= scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age= scan.nextInt();
        if(age>=65){
            seniorCitizens+=1;
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens "+seniorCitizens);
            System.out.println("New nonSeniorCitizens "+nonSeniorCitizen);
        }else {
            nonSeniorCitizen+=1;
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens "+seniorCitizens);
            System.out.println("New nonSeniorCitizens "+nonSeniorCitizen);
        }

    }
}
