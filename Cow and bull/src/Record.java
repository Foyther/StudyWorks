
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class Record {
    private int record;
    private DB db;
    private int curRec;
    private ArrayList<String> temp;
    
    public Record(int record, DB db){
        this.record = record;
        this.db = db;
        temp = db.read();
        curRec = Integer.valueOf(temp.get(0));
        this.check();
        db.fresh();
        db.write(curRec+"");
        
    }
    
    public void check(){
        if(record > curRec){
            curRec = record;
            System.out.println("_____________NEW RECORD - " + curRec + "____________");
        } 
    }
    
    public int getCurRec() {
        return curRec;
    }
    
    
}
