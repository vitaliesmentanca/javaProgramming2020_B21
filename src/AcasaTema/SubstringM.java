package AcasaTema;

import java.util.Scanner;

public class SubstringM {
    public static void main(String[] args) {
 //<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender ;
        String phoneNumber;
        String messageBody;
        sender=message.substring(message.indexOf("<")+1,message.lastIndexOf(">."));
        phoneNumber=message.substring(message.indexOf("[")+1,message.lastIndexOf("]"));
        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));//merge si cu index
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);
    }
}
