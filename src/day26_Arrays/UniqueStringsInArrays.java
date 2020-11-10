package day26_Arrays;

public class UniqueStringsInArrays {
    public static void main(String[] args) {
        String[] arr={"C#","C#","Java","Python","Python","C++"};

        for(int j=0;j< arr.length;j++){
            //  frequency of  single element ↓
            String element=arr[j];//"C#"
            int frequency=0;
            for (int i=0;i<arr.length;i++){
                if(arr[i].equals(element)){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.print(element+" ");
            }
            //frequency of one element ↑
        }




    }
}
