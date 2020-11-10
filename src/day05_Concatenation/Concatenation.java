package day05_Concatenation;

public class Concatenation {
    public static void main(String[] args) {
        String brand="toyota";
        String model="camry";
        int year=2010;
        int mileage=55000;
        String color="Red";
        double price=18000;
        String carInfo=year+" "+brand+" "+model+", "+mileage+" miles, "+color+", $"+price;
        String num="JAVA";


        System.out.println("\""+num+"\"");
        System.out.println(carInfo);
        System.out.println(2+""+5);//concatenation of 2 integer value is 25 not 7
        System.out.println(color.concat(model));//another way to concat

    }
}
