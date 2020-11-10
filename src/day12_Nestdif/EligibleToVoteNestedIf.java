package day12_Nestdif;

public class EligibleToVoteNestedIf {
    public static void main(String[] args) {
        String citizen="USA";
        int age=17;
        if(citizen=="USA"){
            if(age>=18){
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("You must be at least 18 years old to vote");
            }



        }else{
            System.out.println("You must be citizen to vote");
        }


    }
}
