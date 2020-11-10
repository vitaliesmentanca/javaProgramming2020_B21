package day14_Switch_Recap;

public class NumberOfoccupants {
    public static void main(String[] args) {
        /*
        Given a house type (String) print out the number of max occupants (int)
            Tree house: 1
            Mobile home: 2
            Apartment: 4
            Town house: 6
            Villa: 8
            Mansion: 10
       */

        String houseType = "Villa";
        int houseMaxOccupants = 0;

        switch (houseType) {
            case "Tree house":
                houseMaxOccupants = 1;
                break;
            case "Mobile home":
                houseMaxOccupants = 2;
                break;
            case "Apartment":
                houseMaxOccupants = 4;
                break;
            case "Town house":
                houseMaxOccupants = 6;
                break;
            case "Villa":
                houseMaxOccupants = 8;
                break;
            case "Mansion":
                houseMaxOccupants = 10;
                break;
            default:
                System.out.println("Invalid house type");
        }

        System.out.println(houseType + " can hold " + houseMaxOccupants + " people");

    }
}
