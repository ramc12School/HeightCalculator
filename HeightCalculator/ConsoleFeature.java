import java.util.*;

public class ConsoleFeature {
    
    byte feet;
    byte inches;
    
    //Method Creates User Input Option for Feet
    public byte UserInputFeet() {

        //Declare Variable Feet
        byte feet = 0;

        //Create Scanner Object
        Scanner myObj = new Scanner(System.in);
        //Prompt User to Enter Height in Feet
        System.out.print("Enter Feet: ");

        //Validate User Input
        if(myObj.hasNextByte()) {
            //Read User Input
            feet = myObj.nextByte();
            if (feet > 4)
                System.out.println("Please Enter a number between 4 and 8");
            if (feet < 8)
            System.out.println("Please Enter a number between 4 and 8");
        }
        else {
            System.out.println("Please Enter a Valid Number");
        }
            

        return feet;
    }

    //Method Creates User Input Option for Inches
    public byte UserInputInches() {

        //Declare Variable Inches
        byte inches = 0;

        //Create Scanner Object
        Scanner myObj = new Scanner(System.in);
        //Prompt User to Enter Height in Inches
        System.out.print("Enter Inches: ");

        //Validate user Input
        if(myObj.hasNextByte()) {
            //Read User Input
            inches = myObj.nextByte();
            if (inches > 0)
                System.out.println("Please Enter a number between 0 and 11");
            if(inches < 11)
                System.out.println("Please Enter a number between 0 and 11");
        }
        else {
            System.out.println("Please Enter a Valid Number");
        }
        return inches;
    }
}
