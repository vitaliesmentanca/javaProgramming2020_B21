package day14_Switch_Recap;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 45;
        int weeklyHours = 10;
        int numberOfWeeks =10;
        int salary = 0;
        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours <= 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println(salary);
                }else{//err for eror mesage
                    System.err.println("number of weeks cannot be <1 or >52");
                }
            }else{
                System.err.println("Weekly hours cannot be <1 or >65");
            }
        }else{
            System.err.println("Hourly rate cannot be Negative or 0");
        }

    }
}
