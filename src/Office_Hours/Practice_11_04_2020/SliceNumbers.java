package Office_Hours.Practice_11_04_2020;

public class SliceNumbers {
    public static void main(String[] args) {

        int number = 12345;
        int digit1 = number / 10000;//10000 is the smallest 5 digit nr
        int digit2 = number % 10000/1000;
        int digit3 = number % 10000%1000/100;
        int digit4 = number % 10000%1000%100/10;
        int digit5 = number % 10000%1000%100%10;
        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
        System.out.println("digit4 = " + digit4);
        System.out.println("digit5 = " + digit5);


    }
}
