package day08_ShortHand_RelationConverting;

public class GallonsToLiters {
    public static void main(String[] args) {
       int gallons=100;
       double liters=gallons*3.785;
       int result=(int)liters;

        System.out.println(gallons+" gallons equal to "+/*  result  /another way*/(int)(gallons*3.785)+" liters");
    }
}
