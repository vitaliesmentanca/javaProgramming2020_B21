package day08_ShortHand_RelationConverting;

public class ShortHabdOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
        String schoolName = "Cybertek";
        schoolName = "mit";
        System.out.println(schoolName);
        int x = 100;
        x -= 62;//x=x-62  ==>38
        System.out.println(x);
        double salary=100000;
        salary-=salary*0.28;
        System.out.println(salary);

        int x2 =999999;
        x2-=25;
        System.out.println(x2);

        double balance=2000;
        balance-=450;
        System.out.println(balance);
        balance-=1000;
        System.out.println(balance);
        //deposit
        balance+=5000;
        System.out.println(balance);

        int y2=400;
        y2+=10000*0.1;
        System.out.println(y2);

                String name="Cybertek";
                name+="School";
        System.out.println(name);

        double totalTax=100000;
        totalTax*=0.28;
        System.out.println(totalTax);
        int bonus=5000;
        bonus*=2+1;
        System.out.println(bonus);

        int y3=10;
        y3/=5;
        System.out.println(y3);
        int house =500000;
        int month=240;
        double monthlyPayment=house;
        monthlyPayment/=month;
        System.out.println("monthlyPayment "+monthlyPayment);

        int a2=100;
        a2%=3;
        System.out.println("ramainder is "+a2);






    }

}
