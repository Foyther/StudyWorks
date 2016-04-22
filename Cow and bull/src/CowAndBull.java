import java.util.Scanner;
import javax.swing.*;

public class CowAndBull {

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input;
		boolean continuation = true;
                Window tru = new Window();
		Game game = new Game();
		while(continuation){
                    System.out.print("What level do you choose? (It's quarty char) - ");
                    int level = sc.nextInt();
                    game.length(level);
                    game.randomize();
                    ComputerMind mind = new ComputerMind(level,game);
                    Painting paint = new Painting();
                    paint.paintComponent();
  
                    while(true){
                    System.out.print("\n" + "Your word? ");
                    input = sc.next();
                    sc.nextLine();
                    System.out.println("\n" + "_______________________________");
                    game.begin(input, level);
                    game.setScoreOfOneGame(game.getScoreOfOneGame() - 10*level);
                    if(game.getBull() == game.getLength()) break;
                    }
                    
                    System.out.println("Do you want to try again? (true or false) ");
                    continuation = sc.nextBoolean();
		}
	}
}
