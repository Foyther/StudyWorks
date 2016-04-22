
public class ComputerMind {
    private int length;
    private String input;
    private Game game;
    
    public ComputerMind(int level, Game game){
        this.length = level;
        this.game = game;
    } 
    
    public String randomize(){
        String a = " ";
        while (a.length() != length) {
            int run = (int) Math.round(Math.random() * (game.getSelectWord().length - 1) - 0);
            a = game.getSelectWord(run);
        }
        return a;
    }
}
