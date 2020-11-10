package AcasaTema;

import java.util.Scanner;

public class TimeHourToMinSec {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds= scan.nextInt();
        int hours,minutes, seconds,remained=0;
        hours=inputSeconds/3600;
        remained=inputSeconds%3600;
        minutes=remained/60;
        seconds=remained%60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

    }
}
