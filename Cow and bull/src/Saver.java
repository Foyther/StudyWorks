
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurislam
 */ 
public class Saver {
    private DB db;
    private ArrayList<String> text;

    public ArrayList getText() {
        return text;
    }
    
    public Saver(DB db){
        this.db = db;
        text = this.db.read();
    }
    
    public boolean checkDB(){
        if(text.size() == 0){
            return false;
        }
        else return true;
    }
}
