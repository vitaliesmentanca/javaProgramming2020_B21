package day23_NestedLoop;

public class FrequencyWordToLowerCase {
    public static void main(String[] args) {
        String sentence="Java Java java java ";
        String word="java";
        word=word.toLowerCase();

        String temp=sentence.toLowerCase();/*Java java java java */
        int count=0;
        while (temp.contains(word)){
            temp=temp.replaceFirst(word,"");
            count++;
        }
        System.out.println("count = " + count);
    }
}
