import java.io.PrintStream;

public class ScoreException extends Exception{
    
    @Override 
    public void printStackTrace(PrintStream s){
        System.err.println("YOU LOSE");
        
    }
}
