import java.util.*;

public class ConfirmationFeature {

    //Method to display confirmation information to the user.
    public String ConfirmEntry(Byte newFeet, Byte newInches) {

        //Create Scanner Object
        Scanner myObj = new Scanner(System.in);

        //Recap User Input
        System.out.println("The Height you Entered is: " + newFeet + " feet and " + newInches + " inches.");
        System.out.print("Is This Correct (Enter Y or N): ");

        //Read User Input
        String answer = myObj.nextLine();

        return answer;
    }

    
}
