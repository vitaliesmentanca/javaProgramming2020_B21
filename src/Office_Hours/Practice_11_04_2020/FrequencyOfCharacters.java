package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="abbacaa";//a5b2c1
        String result="";
        for (int j=0;j<=str.length()-1;j++){//multiple frequency

            //  frequency of  single char ↓
            char ch=str.charAt(j);//abc
            int count=0;// 5 2 1
            for (int i=0;i<=str.length()-1;i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }//frequency of one char ↑

            if(result.contains(""+ch)){
                continue;
            }
            result+=""+ch+count+" ";
        }


        System.out.println(result);
        
        
        
    }
}
