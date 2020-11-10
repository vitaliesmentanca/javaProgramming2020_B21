package day16_Scanner;

import java.util.Scanner;

public class Scanner_switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Browser type");
        String browser=input.nextLine();
        input.close();//close scanner

        switch (browser){
            case "CHROME"://SE POATE SI ASA
            case "chrome":
                System.out.println("Chreome is opening");
                break;
            case "FIREFOX":
            case("firefox"):
                System.out.println("firefox is opening");
                break;
            case("opera"):
                System.out.println("opera is opening");
                break;
            case("safary"):
                System.out.println("safary is opening");
                break;
            case("ie"):
                System.out.println("ie is opening");
                break;
            default:
                System.out.println(browser+" is not valid");
        }




    }
}
