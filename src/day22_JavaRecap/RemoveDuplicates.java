package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAAABBBBBBCCCCCCCCDDDDDDDDEEEEEEEEFFFFFFFFFggghhhjjj";
        String result = ""; //"ABCDEF" ca si cum il scrie in loc  nou si compara cu gol("")

        for(int i = 0; i < str.length(); i++ ){

            String eachCharacter = ""+str.toLowerCase().charAt(i);  // A, B, B, C, C

            if(result.contains(eachCharacter)){
                continue;
            }else{ // if the character of str is not contained in the result yet, then we concate the character
                result += eachCharacter;
            }

            /*
            if(!result.contains(eachCharacter)){
                result += eachCharacter;
            }
             */

            //  result += (!result.contains(eachCharacter))? eachCharacter : "";


        }

        System.out.println("result = " + result);
    }
}
