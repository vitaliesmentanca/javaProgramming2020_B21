package day28_MultidimensionalArray;

public class LongestString {
    public static void main(String[] args) {
        String[] names = {"Ana",  "Safari", "Suveyda", "Bektemirov", "Pedro"};
        String longest=names[0];
        String shortest=names[0];
        for (String each:names){
            if (each.length()>longest.length()){
                longest=each;
            }
            if (each.length()<shortest.length()){
                shortest=each;
            }
        }
        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);

    }
}
