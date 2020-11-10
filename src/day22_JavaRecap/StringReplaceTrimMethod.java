package day22_JavaRecap;

import java.util.Scanner;

public class StringReplaceTrimMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String  sentence="Capital of Canada is Washington";
        sentence=sentence.replace("Canada","United States");
        System.out.println("sentence = " + sentence);

        System.out.println("================================");
        String s="Cybertek School is in Boston,Cybertek Campus is in Mclean";
        s=s.replaceFirst("Cybertek","MIT");
        System.out.println("s = " + s);
        System.out.println("==============");
        
        String r="cava is cool programming language, I can learn cava at cybertek school";
        r=r.replace("cav","jav");
        System.out.println("r = " + r);
        System.out.println("============");
        String p="I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java", "C#");
        p = p.replaceFirst("Java", "java");
        p = p.replace("Java", "");

       // p=p.replace("Java","").replace("like","like java");
        System.out.println("p = " + p);
        System.out.println("=============");
        //Trim: removes white spaces only from begin and ends
        String str="                 ";
        System.out.println(str.length());
        str=str.trim();
        System.out.println(str.length());

        String str2="             Cubertek          School     fun       ";
        System.out.println(str2);
        str2=str2.trim();
        System.out.println(str2);
        
    }
}
