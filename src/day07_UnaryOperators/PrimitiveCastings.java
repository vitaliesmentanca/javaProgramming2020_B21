package day07_UnaryOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        short a=3000;
        long b=a;
        int d=a;// implicit casting,automaticly done small to big

        double d1=200.5;
        int i1=(int) d1;//200,explicit manual
        System.out.println(i1);
        long l1=100;
        short s1=(short) l1;  //explicit manual big to small

        double d2=300;
        float f1= (float) d2;//alt shift enter shortcut intely

        short s2=400;
        byte b1= (byte) s2; //alt enter then enter,, is out of rage of value of byte -128  128
        System.out.println(b1);//is out of rage of value of byte -128  128





    }
}
