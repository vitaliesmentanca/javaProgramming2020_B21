package day13_SwitchStatement;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        String browser = "chrome";
        String selectedBrowser = "";
        switch (browser) {
            case "chrome":
                selectedBrowser = "Chrome Browser";
                break;
            case "firefox":
                selectedBrowser = "Firefox Browser";
                break;
            case "opera":
                selectedBrowser = "Opera Browser";
                break;
            case "safari":
                selectedBrowser = "Safari Browser";
                break;
            case"edge":
                selectedBrowser="Edge Browser";
                break;
            case "ie":
                selectedBrowser="IE Browser";
                break;
            default:
                selectedBrowser="Invalid Browser";


        }
        System.out.println(selectedBrowser);
    }
}
