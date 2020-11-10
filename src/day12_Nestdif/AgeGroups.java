package day12_Nestdif;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 13;
        String ageGroups = "";
        if (age >= 1 && age <= 2) {//age can't be zero
            ageGroups = "infant";
        } else if (age >= 3 && age <= 5) {//example
            ageGroups = "Toddler";
        } else if (age <= 9) {
            ageGroups = "Kid";
        } else if (age <= 12) {
            ageGroups = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            ageGroups = "Teenager";
        } else if (age <= 20) {
            ageGroups = "Young Adult";
        } else if (age <= 39) {
            ageGroups = "Adult";
        } else if (age <= 49) {
            ageGroups = "Young Middle-Age Adult";
        } else if (age <= 54) {
            ageGroups = "Middle Age Adult";
        } else if (age <= 64) {
            ageGroups = "Very Young Senior Citizen";
        } else if (age <= 74) {
            ageGroups = "Young Senior Citizen";
        } else if (age <= 84) {
            ageGroups = "Senior Citizen";
        } else {
            ageGroups = "Old Senior Citizen ";
        }
        System.out.println(ageGroups);

    }
}
