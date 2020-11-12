package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[][] arr2D={{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][][] arr3D={  {{10,20,30,40},{11,22,33,44}} , {{111,222,333,444},{1111,2222,3333,4444}}};
        System.out.println( arr2D[2]);//nu merge
        System.out.println(Arrays.toString(arr2D[2]));

        System.out.println(Arrays.toString(arr2D));//nu merge
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("====================================");
        for (int[]each1DArray:arr2D){
            System.out.println(Arrays.toString(each1DArray));
            for (int eachElement:each1DArray){
                System.out.println(eachElement);
            }
        }
        System.out.println("===|||||||||======||||||||||================||||||=============");

        for(int[]each1DArray:arr2D){
            for (int eachElement:each1DArray){
                if (eachElement%2!=0){
                    System.out.println("odd nr "+ eachElement);
                }
            }
        }
    }
}
