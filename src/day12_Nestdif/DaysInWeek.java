package day12_Nestdif;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 7;
        String day = "";
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                day = "Monday";
            } else if (number == 2) {
                day = "Tuesday";
            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 4) {
                day = "Thursday";
            } else if (number == 5) {
                day = "Friday";
            } else if (number == 6) {
                day = "Saturday";
            } else if (number == 7) {
                day = "Sunday";
            }
        } else {
            day = "Invalid nr";
        }

        System.out.println(day);
    }
}
