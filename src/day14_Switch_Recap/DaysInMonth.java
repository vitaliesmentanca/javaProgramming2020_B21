package day14_Switch_Recap;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2021;
        String month = "Fуb";
        String result = "";
        switch (month) {
            case "Jan":
                result = "31 days";
                break;
            case "Feb":
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }
                break;
            case "Mar":
                result = "30 days";
                break;

            case "Apr":
                result = "31 days";
                break;
            case "Mai":
                result = "30 days";
                break;
            case "Iun":
                result = "31 days";
                break;
            case "Iul":
                result = "31 days";
                break;
            case "Aug":
                result = "31 days";
                break;
            case "Sep":
                result = "30 days";
                break;
            case "Oct":
                result = "31 days";
                break;
            case "Nov":
                result = "30 days";
                break;
            case "Dec":
                result = "31 days";
                break;
            default:result="invalid";
        }
        System.out.println(result);


    }
}
