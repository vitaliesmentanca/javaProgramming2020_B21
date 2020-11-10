package day21_whileLoops;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;//skip 3 and continue loop
            }
            System.out.println(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");

    }
}
