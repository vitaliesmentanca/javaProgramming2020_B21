package day11_MultiBtanchIf;

public class QuizQuestions {
    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300;
        ivar = (int) fvar;// explicit casting
        fvar = ivar;//implicit way casting
        dvar=fvar;
        fvar=(float)dvar;
        dvar=ivar;
        ivar=(int)dvar;


    }
}
