package day05_Concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName="Vitalie";
        String lastName="Daniel";
        String fullName=firstName+" "+lastName;
        char genre='M';
        int age=35;
       String companyName="Capital One";
       String jobTitle="SDET";
       boolean isFullTime=true;
       boolean isMarried=false;
       double salary=120000.50;
        System.out.println("Employee' full  name is: "+fullName);
        System.out.println(fullName+"' genre is: "+genre);
        System.out.println(fullName+"' age is "+age+" years old");
        System.out.println(fullName+" works at: "+ "\"" +companyName+"\"");
        System.out.println(fullName+"' Job title is: "+jobTitle);
        System.out.println(fullName+"' salary is "+salary+"$");
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName+" is married: "+isMarried);

    }
}
 /*firstName = John
         lastName = Daniel
         gender = M
         age = 35
         companyName = CapitalOne
         jobTitle = SDET
         isFullTime = true
         isMarried = false
         salary = 120000.50
         output:
         Employee' full name is: John Daniel
         John Daniel' gender is: M
         John Daniel' age is: 35 years old
         John Daniel works at: CapitalOne
         John Daniel' Job title is: SDET
         John Daniel' salary is 120000.5 $
         John Daniel is full time employee: true
         John Daniel is married: false*/
