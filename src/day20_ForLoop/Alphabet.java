package day20_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i+" ");
        }
        System.out.println("=============================");
        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println("=============================");
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i+" ");
        }
        System.out.println("=============================");
        for(char i='a';i<='z';i++){
            System.out.print(i+" ");
        }

    }
}
