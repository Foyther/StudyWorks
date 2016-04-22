import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {
    private JButton newGame;
    private JButton record;
    
    
    public Window(){
    super("Окно для прикола");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,600);
    this.setVisible(true);
    this.menu();
    }
    
    public void menu(){
        newGame = new JButton("New Game");
        this.getContentPane().add(newGame);
        newGame.addActionListener(this);
        record = new JButton("Games records");
        this.getContentPane().add(record);
    }
    
    public void game(){
        
    }
    
    public void setButton(String s, JButton button){
        button.setText(s);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        newGame.setText("I've been clicked!");
        this.setVisible(false);
    }
}
