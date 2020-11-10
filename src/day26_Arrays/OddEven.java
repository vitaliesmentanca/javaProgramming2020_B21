package day26_Arrays;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[]numbers=new int[100];
        for(int i=0;i<=99;i++){
        numbers[i]=i+1;//+1 because we need 1 to 100 not 0 to 100
        }
        System.out.println(Arrays.toString(numbers));

        int countEven=0;
        int countOdd=0;
        int count3=0;
        int count5=0;

        for(int i=0;i<=numbers.length-1;i++){
            int eachNumber=numbers[i];
            if(eachNumber%2==0){
                countEven++;
            }else{
                countOdd++;
            }
            if(eachNumber%3==0){
                count3++;
            }
            if(eachNumber%5==0){
                count5++;
            }
        }
        System.out.println("Count even: "+countEven);
        System.out.println("Count odd: "+countOdd);
        System.out.println("Divisible by 3: " + count3);
        System.out.println("Divisible by 5: " + count5);

    }
}
