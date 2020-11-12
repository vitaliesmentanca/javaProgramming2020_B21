package Office_Hours.Practice_11_11_2020;


import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] score=new int[5];//[10, 20, 50, 30, 40]
        score[0]=10;
        score[1]=20;
        score[2]=50;
        score[3]=30;
        score[4]=40;
        System.out.println(Arrays.toString(score));
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println("====================================");
        for (int i=0;i<= score.length-1;i++){//= si su -1 se poate de sters
            System.out.println(score[i]);
        }
        System.out.println("==|||||||========|||||||||=========|||||==========");
        for (int each:score){
            System.out.println(each);
        }


    }
}
