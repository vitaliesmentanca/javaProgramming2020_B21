package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="aaaaabbbbccccddd";
        char ch='a';
        int count=0;
        for(int i=0;i<str.length();i++){
            char eachChar=str.charAt(i);
            if(eachChar==ch){
                count++;
            }

        }
        System.out.println(count+" times");
    }
}
