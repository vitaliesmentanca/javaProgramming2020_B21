package day11_MultiBtanchIf;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 300;
        int n3 = 400;


        if (n1 > n2 && n1 > n3) {
            System.out.println("first nr is the maximum number" + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("second nr is the max nr " + n2);
        } else {
            System.out.println("Third nr is the max nr " + n3);
        }


    }

}
