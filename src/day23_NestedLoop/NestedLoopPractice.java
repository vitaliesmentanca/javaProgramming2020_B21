package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for(int j = 1; j <= 8; j++) { // j: 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) { // daca i ii 1 j ii 1...
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
