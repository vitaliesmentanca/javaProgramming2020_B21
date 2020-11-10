package day08_ShortHand_RelationConverting;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        boolean r1 =num1>num2;
        boolean r2=num2>num1;
            boolean r3=num1<num2;
        boolean r4=num2<num1;

        System.out.println(num2+" is greater than "+num1+" is "+r2);
        System.out.println(num1+" is greater than "+num2+" is "+r1);
        System.out.println(num1+" is less than "+num2+" is "+r3);
        System.out.println(num2+" is less than "+num1+" is "+r4);

        System.out.println(10>9);

        //>=  <=
        System.out.println(10>=10);
        System.out.println(10<=9);
        //==   !=
        boolean b1=10==10;
        boolean b2=10!=10;
        System.out.println(b1);
        System.out.println(b2);

        boolean b3="CYbertek"=="Virginia";
        System.out.println(b3);

        boolean b4="Virginia"=="virginia";
        System.out.println(b4);
        boolean b5 ="Muhtar"=="Good Guy";
        System.out.println(b5);

        boolean b6="Muhtar" !="Good guy";
        System.out.println(b6);

        int x=100;
        boolean isEven=x%2==0;
        boolean isOdd=x%2!=0;
    }
}
