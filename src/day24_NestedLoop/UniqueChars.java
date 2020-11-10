package day24_NestedLoop;
/*
        3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCDC";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of the character is equal to 1, it means it's unique
             In previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
     */
public class UniqueChars {
    public static void main(String[] args) {

        String str = "AABCCD";

        for(int index = 0; index < str.length(); index++) {
            // purpose of this loop is to iterate through the char one at a time

            int frequency = 0; // resetting the value each iteration of the outer loop (first loop)

            for(int inner = 0; inner < str.length(); inner++) {

                if(str.charAt(index) == str.charAt(inner)) {
                    frequency++;
                }

            }

            if(frequency == 1) {
                System.out.print(str.charAt(index));
            }

        }



    }

}

