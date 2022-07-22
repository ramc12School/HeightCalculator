import java.security.InvalidParameterException;

public class HeightFeetException {

    public void feetException(byte feet) {
        if (feet > 8 || feet < 4) {
            throw new InvalidParameterException ("Please Enter A Valid Height");
        }
    }
    
}
