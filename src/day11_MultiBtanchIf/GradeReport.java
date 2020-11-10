package day11_MultiBtanchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 91;
        String result = "";
        if (score < 60) {
            result = "Fail";
        } else if (score >= 60 && score < 90) {
            result = "Pass";
        } else {
            result = "pass with distiction";
        }

        System.out.println(result);


    }
}
