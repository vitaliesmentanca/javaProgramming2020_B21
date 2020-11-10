package day20_ForLoop;

public class AlphabetBackwards {
    public static void main(String[] args) {
        for(int i=90;i>=65;i-=1/*i==  i=i+1*/){
            System.out.print((char)i+" ");
        }
        System.out.println();
            for(char i='Z';i>='A';i--){
                System.out.print(i+" ");
            }
        System.out.println();

        for(int i=122;i>=97;i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
        for(char i='z';i>='a';i--){
            System.out.print(i+" ");
        }

    }
}
