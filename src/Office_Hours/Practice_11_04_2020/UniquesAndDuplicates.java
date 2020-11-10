package Office_Hours.Practice_11_04_2020;


import java.util.Scanner;

public class UniquesAndDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "aaabcccd";
        String unique = "";//bd
        String duplicates="";//aacc

        for (int j=0;j<=str.length()-1;j++){//frequency of one multiple char ↓


            //  frequency of one single char↓
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }//frequency on one char ↑
            if (frequency == 1) {
                unique += ch;
            }
            if(frequency>1){//can apply else
                           //&&!duplicates.contains(""+ch);// in result print only one char :ac ,not "aaaccc"
                duplicates+=ch;
            }


        }//frequency of one multiple char ↑
        System.out.println("unique is = " + unique);
        System.out.println("duplicates = " + duplicates);

    }
}
