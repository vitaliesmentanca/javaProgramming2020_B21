package day23_NestedLoop;
/*
FrequencyOfWord
	1. write a program that can return the frequncy of the a word from the sentence
		Ex:
			sentence = "Java is a programming language, I like to learn Java";
			word = "Java";
			output:
				2
				sentence.contains(Java)
 */
public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language, I like to learn Java Java Java Java";
        // " is a programming language, I like to learn Java"
        // " is a programming language, I like to learn"
        String word = "Java";

        int count = 0;

        while( sentence.contains(word) ){
            sentence = sentence.replaceFirst(word, "" ); // we need to remove one at a time to count the frequency
            count++;
        }

        System.out.println(count);
        System.out.println(sentence);

    }
}
