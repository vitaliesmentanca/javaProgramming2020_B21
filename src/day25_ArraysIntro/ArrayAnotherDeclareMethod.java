package day25_ArraysIntro;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ArrayAnotherDeclareMethod {
    public static void main(String[] args) {
        String[]students=new String[5];//5 elements
        students[0]="Agalar";
        students[1]="Mohamed";
        students[2]="Afroz";
        students[3]="Dargisa";
        students[4]="Elvira";
       /* System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);*/
       for(int i=0;i<students.length;i++){
           System.out.println(students[i]);
       }


    }
}
