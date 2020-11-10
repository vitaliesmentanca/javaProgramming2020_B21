package day26_Arrays;

public class UniqueIntegersInArray {
    public static void main(String[] args) {
        int[]arr={1,1,2,3,3,4,1};
            //    0 1 2 3 4

        for(int j=0;j<=arr.length-1;j++){
            //  frequency of  single element ↓
            int element=arr[j];
            int frequency=0;
            for(int i=0;i<=arr.length-1;i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(element+" ");
            }
            //frequency of one element ↑
        }


        
    }
}
