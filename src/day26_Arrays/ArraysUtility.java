package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        //       Arrays.toString(Array name group) print all items in array group
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers);  //hashcode

        System.out.println(Arrays.toString(numbers));
        String str1 = "Cybertek";
        System.out.println(str1);

        String[] classMates = {"Adil", "Muhammad", "Yasin", "Necdet", "Daniel"};
        System.out.println(classMates);  // hashcode
        System.out.println(Arrays.toString(classMates));

        // Array.sort(Array group name) -sort in ascending order
        int[] arr1 = {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};

        Arrays.sort(arr1);  // does not return any value, cannot be assigned to a variable nor pass it in print statement

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: " + arr1[arr1.length - 1]);
        System.out.println("Min: " + arr1[0]);

        double[] arr2 = {1.5, 0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Second minimum number " + arr2[1]);
        System.out.println("Second maximum number " + arr2[arr2.length-2]);
        System.out.println("=====================");
        String[] names = {"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};
        Arrays.sort(names);
        System.out.println( Arrays.toString(names)  );
        System.out.println("================================");
        // Array.equals(1,2 //compare arrays group) -sort in ascending order
        int[]a1={1,2,3};
        int[]a2={1,3,2};
        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean r1=Arrays.equals(a1,a2);
        System.out.println(r1);



    }
}
