package day22_JavaRecap;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        String str = "Today I lear ned Java Language";//6 de a 
        char ch = 'a';

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i); // represents each character from the string
            if(ch == eachChar){
                count++;
            }
        }

        System.out.println("count = " + count);
        System.out.println("Number of words: "+ (count+1));



    }
}
