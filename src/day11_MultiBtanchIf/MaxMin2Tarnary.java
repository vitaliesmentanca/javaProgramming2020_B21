package day11_MultiBtanchIf;

public class MaxMin2Tarnary {
    public static void main(String[] args) {
        int n1=100;
        int n2=200;
        int n3=300;
        int max1=0;

        if(n1>n2&&n1>n3){
            max1=n1;
        }else if (n2>n1&&n2>n3){
            max1=n2;
        }else{
            max1=n3;
        }
        System.out.println(max1);
        int max2=(n1>n2&&n1>n2)?n1:(n2>n1&&n2>n1)?n2:n3;
        System.out.println(max2);

        System.out.println("-----------------");
        int min1=0;
        if(n1<n2&&n1<n3){
            min1=n1;
        }else if (n2<n1&&n2<n3){
            min1=n2;
        }else{
           min1=n3;
        }
        System.out.println(min1);
        int min2=(n1<n2&&n1<n3)?n1:(n2<n1&&n2<n3)?n2:n3;
        System.out.println(min2);
    }
}
