package day26_Arrays;

import java.util.Arrays;

public class ArrayStringMethodsCharSplit {
    public static void main(String[] args) {
        //char method
        String str = "abcde";
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        System.out.println("==========================");

        String s1 = "acb";//anagram
        String s2 = "bac";//anagram
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println(isAnagram);

        System.out.println("================");
        //split method
        String sentence="Today is great day";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
