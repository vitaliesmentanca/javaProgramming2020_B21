package day25_ArraysIntro;

public class ArrayIntro {
    public static void main(String[] args) {


        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel","Aliya","Marwan"};
        //index num:       0          1      2      3       4          5      6
        System.out.println(names[2]);
        String str1 = names[0];//store into a variable
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 75, 80, 78};
        //index        0   1   2   3   4   5   6
        System.out.println("====================================");
        //Erjon:70
        /*System.out.println(names[0]+":"+score[0]);
        System.out.println(names[1]+":"+score[1]);
        System.out.println(names[2]+":"+score[2]);
        System.out.println(names[3]+":"+score[3]);*/
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]+":"+score[i]);
        }




    }
}
