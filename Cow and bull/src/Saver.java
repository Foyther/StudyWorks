
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
    private ArrayList text;
    
    public Saver(DB db){
        this.db = db;
    }
    
    private boolean checkDB(){
        text = this.db.read();
    }
}
