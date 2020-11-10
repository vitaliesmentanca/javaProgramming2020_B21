package AcasaTema;

import java.util.Scanner;

public class RestaurantCheckCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double totalTip;
        double totalPerPerson;
        double totalToPay;

        System.out.println("Split:");
        String split= scan.next();
        System.out.println("Number of people:");
        int numberPeople= scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality= scan.next();

        if(serviceQuality.equalsIgnoreCase("Poor")){
            totalTip=checkAmount*0.05;
        }else if(serviceQuality.equalsIgnoreCase("Fair")){
            totalTip=checkAmount*0.10;
        }else if(serviceQuality.equalsIgnoreCase("Goog")){
            totalTip= checkAmount*0.15;
        }else if(serviceQuality.equalsIgnoreCase("Great")){
            totalTip= checkAmount*0.20;
        }else {
            totalTip= checkAmount*0.25;
        }
        if(split.equalsIgnoreCase("Yes")){
            totalPerPerson=(checkAmount /numberPeople)+(totalTip/numberPeople);
            totalToPay=checkAmount+totalTip;
            String numPeopleAmpersand="";
            for(int i=1;i<=numberPeople;i++){
                numPeopleAmpersand+="&";
            }
            System.out.println("Number of people entered: "+numPeopleAmpersand);
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: "+(totalTip/numberPeople));
        }


    }
}
