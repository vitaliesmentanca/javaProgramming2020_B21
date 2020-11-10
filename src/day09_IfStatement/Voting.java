package day09_IfStatement;

public class Voting {
    public static void main(String[] args) {
        String name="John";
        String citizenShip="USA";
        boolean eligible= citizenShip=="USA";
        System.out.println("John is eligible to vote for trump or Biden? "+eligible);

        String name1="Jimmy";
        boolean citizenShip1=false;
        boolean eligible1= citizenShip1==true;
        System.out.println("Jimmy is eligible to vote for trump or Biden? "+eligible1);


    }
}
