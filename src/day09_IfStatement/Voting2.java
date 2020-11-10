package day09_IfStatement;

public class Voting2 {
    public static void main(String[] args) {
        String name="Danie";
        boolean isUSACitizen=true;
        int age=38;
        boolean hascriminalBackground=false;
        boolean isEligible=isUSACitizen==true && age>=18&& hascriminalBackground==false;
        System.out.println(name+"is eligible to vote:= "+ isEligible);
        System.out.println("---------------------");

        String name2="John";
        String c1="Canada";
        String c2="USA";
        boolean eligible=c1=="USA"|| c2=="USA";
        System.out.println(name+" is eligible to vote: "+eligible);


    }
}
