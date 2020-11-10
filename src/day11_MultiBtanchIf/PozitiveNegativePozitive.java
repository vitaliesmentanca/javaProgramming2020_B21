package day11_MultiBtanchIf;

public class PozitiveNegativePozitive {
    public static void main(String[] args) {

        int number =100;
        if (number<0){
            System.out.println("Negativr");
        }
        if(number>0){
            System.out.println("Positive");
        }
        if(number==0){
            System.out.println("Zero");
        }
        System.out.println("----------------------");

        if(number<0){
            System.out.println("Negative");
        }else if (number>0){
            System.out.println("pozitive");
        }else{
            System.out.println("zero");
        }


    }
}
