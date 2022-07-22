public class HeightCalculator {

    //Main Method / Main Driver
    public static void main (String [] args) {
      
            //Call ConsoleFeature Class and UserInputFeet method
            ConsoleFeature consoleDriver1 = new ConsoleFeature();
            byte feet = consoleDriver1.UserInputFeet();

            //Call Consule Feature Class and UserInputInches method
            ConsoleFeature consoleDriver2 = new ConsoleFeature();
            byte inches = consoleDriver2.UserInputInches();

           
            //Call ConfirmationFeature Class and ConfirmEntry method to recap user input
            ConfirmationFeature confirmationDriver1 = new ConfirmationFeature();
            String answer = confirmationDriver1.ConfirmEntry(feet, inches);
                if (answer.equals("y") || answer.equals("Y")) {
                    
                }
                else {
                    //Prints Goodbye Message
                    System.out.println("Try Again! Goodbye!");
                    //Terminates the program so user can rerun the program
                    System.exit(0);
                }
    

            //Produce Final result of height in inches
            Calculations calculationsDriver1 = new Calculations();
            byte finalProduct = calculationsDriver1.CalculateHeightInInches(feet, inches);

            System.out.println("The height in inches is = " + finalProduct + " inches");
        
        }
}