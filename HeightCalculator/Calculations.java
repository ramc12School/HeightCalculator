public class Calculations {

    public byte CalculateHeightInInches(byte feet, byte inches) {

        //Declare finalProduct Variable
        byte finalProduct;
    
        //Initialize finalProduct Variable
        finalProduct = (byte) ((12*feet) + inches);

        return finalProduct;
    }
    
}
