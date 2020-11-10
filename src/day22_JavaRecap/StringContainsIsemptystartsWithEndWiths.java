package day22_JavaRecap;

public class StringContainsIsemptystartsWithEndWiths {
    public static void main(String[] args) {
        //contains(true false),isEmpty,startsWith,endsWth
        String s2 = "I like to learn Java";
        System.out.println("Contains c#: " + s2.toLowerCase().contains("java"));
        System.out.println(s2.equals("java"));//false p/u ca compara cu intraga fraza
        System.out.println(s2.equalsIgnoreCase("java"));//false p/u ca compara cu intraga fraza
        System.out.println("================================");

        String s3 = "Cybertek School is the best";

        System.out.println(s3.contains("cybertek")); // false
        System.out.println(s3.toLowerCase().contains("cybertek"));  //true,  ignore case sensitivity

        System.out.println(s3.equals("cybertek")); // false
        System.out.println(s3.equalsIgnoreCase("cybertek"));  // false

        System.out.println("Java".isEmpty()); // false
        System.out.println("".isEmpty()); // true

        System.out.println("=================================");
        // startsWith, endsWith

        String URL = "https://www.amazon.wer";   // .com, .gov, .edu

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com") || URL.endsWith(".edu") || URL.endsWith(".gov"));

        if (isValid) {
            System.out.println("URL is valid");
        } else {
            System.out.println("Invalid");
        }

        /*
        valid emails: gmail, hotmail, yahoo, outlook
         */

        String email = "Java_Master@yahoo.com";

        boolean validEmail = email.endsWith("gmail.com") || email.endsWith("yahoo.com")
                || email.endsWith("hotmail.com") || email.endsWith("outlook.com");

        if (validEmail) {
            System.out.println("valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
