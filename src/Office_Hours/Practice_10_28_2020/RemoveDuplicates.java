package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abab";
        String nonDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            String eachChar=""+str.charAt(i);//"" p/u ca char can not casting to string
            if (nonDuplicate.contains(eachChar  )) {
                continue;
            }else{
                nonDuplicate+=eachChar;
            }
        }
        System.out.println("nonDuplicate = " + nonDuplicate);

    }
}
