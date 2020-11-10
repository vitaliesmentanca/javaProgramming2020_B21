package day23_NestedLoop;

public class FrequencyWordEqualIgnoreCase {
    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat CAT CAt cAt";
        String temp=sentence.toLowerCase();
        
         int countDog=0;
         String word="dog";
         while (temp.contains(word)){
         temp=temp.replaceFirst(word,"");
         countDog++;
         }
        System.out.println("countDog = " + countDog);
        int countCat=0;
        while (temp.contains("cat")){
            temp=temp.replaceFirst("cat","");
            countCat++;
        }
        System.out.println("countCat = " + countCat);

        System.out.println(countCat==countDog);
    }
}
