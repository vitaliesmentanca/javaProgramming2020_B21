package AcasaTema;

import java.util.Scanner;


public class IfNameChen048 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("In:");
        String name=inp.nextLine();
        if(name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }
    }

}
