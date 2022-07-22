import java.security.InvalidParameterException;
import java.util.*;

public class ExceptionFeature {
    
    public void heightFeetException(byte feet) {
        if (feet > 8 || feet < 4) {
            throw new InvalidParameterException ("Please Enter A Valid Height");
        }
    }

    public void heightInchesException(byte inches) {
        if (inches >= 13 || inches < 0) {
            throw new InvalidParameterException ("Please Enter A Valid Height");
        }
    }
}
