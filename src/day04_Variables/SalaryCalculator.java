package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary=100000;
        double taxRate=0.28;
        double totalTax=salary*taxRate;
        double salaryAfterTAx=salary-totalTax;
        System.out.println("Total Tax "+salary*taxRate);
        System.out.println("Salary after tax "+salaryAfterTAx);

    }


}
