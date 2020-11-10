package day09_IfStatement;

public class EligibleToBuyAlcohol2 {
    public static void main(String[] args) {

       int age=25;
       boolean eligible= age>=21;
       if(eligible){
           System.out.println("You are eligible to buy");
       }
       if(!eligible) {
           System.out.println("go buy your milk");
       }
        System.out.println("----------------");
       boolean isBreakTime=true;
        if (isBreakTime){
            System.out.println("Time to take a break");
        }
        if(!isBreakTime){
            System.out.println("LEt's continue the class");
        }

    }
}
