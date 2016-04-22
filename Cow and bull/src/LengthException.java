import java.io.PrintStream;
public class LengthException extends Exception{

    @Override 
    public void printStackTrace(PrintStream s){
        System.err.println("Your length word no equal level");
    }
}
