/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurislam
 */
public class Level {
    private DB[] db;
    
    public Level(){
        db = new DB[6];
        for(int i = 3; i < 9; i++){
            db[i-3] = new DB("word"+ i + ".txt");  
        }
    }
    
    public DB select(int level){
        return db[level-3];
    }
}
