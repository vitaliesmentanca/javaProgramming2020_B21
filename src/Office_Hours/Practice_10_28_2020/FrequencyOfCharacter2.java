package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacter2 {
    public static void main(String[] args) {
        String str="abababa";
        char ch='a';
        int count=0;
        while (str.contains(""+ch)){//"" p/u ca casting char to string
            str=str.replaceFirst(ch+"","");
            count++;

        }
        System.out.println("count = " + count);
    }
}
