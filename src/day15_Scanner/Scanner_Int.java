package day15_Scanner;
import java.util.Scanner;
//import day14_Switch_Recap.SalaryCalculator;
public class Scanner_Int {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//Scanner object called scanner
        System.out.println("enter nr one");
        int numOne= scanner.nextInt();//reading an int number
        System.out.println("enter nr two");
        int numTwo= scanner.nextInt();

        System.out.println("Nr one is "+numOne);
        System.out.println("Nr one is "+numTwo);
        System.out.println("Sum "+(numOne+numTwo));
    }
}
