package day26_Arrays;

import java.util.Arrays;

public class UniqueCharsInArrays {
    public static void main(String[] args) {
        String str="aabbcddeef";
        char[] arr=str.toCharArray();
        //String[] arr=str.split("");↑ we can call the string the same like char
        System.out.println(Arrays.toString(arr));

        for(int j=0;j<=arr.length-1;j++){


            char element=arr[j];
            int frequency=0;
            for (int i=0;i<=arr.length-1;i++){
                if(arr[i]==element){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.print(element+" ");
            }


        }





    }
}
