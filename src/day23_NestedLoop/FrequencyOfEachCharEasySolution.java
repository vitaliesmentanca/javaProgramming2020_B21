package day23_NestedLoop;

public class FrequencyOfEachCharEasySolution {
    public static void main(String[] args) {
        String str = "aaabbcdd    dgggf";//a3b2c1
        str=str.replace(" ","");//remove space
        String expectedResult = "";//"a3b2c1"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //compare to origin a, a, a, b, b, c
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // i represents the index num of str
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            if (!expectedResult.contains("" + ch)) {
                expectedResult += "" + ch + count;
            }
        }

        System.out.println(expectedResult);


    }
}
