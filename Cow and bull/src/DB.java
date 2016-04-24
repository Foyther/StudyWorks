
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurislam
 */
public class DB {
    private File database;
    
    public DB(String s){
        database = new File(s);
    }
    
    public void write(String string){
        try(PrintWriter wr = new PrintWriter(new FileWriter(database, true))){
            wr.write(string + "\r\n");
            wr.flush();
            wr.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void write(int string){
        try(PrintWriter wr = new PrintWriter(new FileWriter(database, true))){
            wr.write(string + "\r\n");
            wr.flush();
            wr.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void fresh(){
        try(PrintWriter wr = new PrintWriter(new FileWriter(database))){
            wr.write("");
            wr.flush();
            wr.close();
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> read(){
        ArrayList<String> word = new ArrayList<>();
        try(BufferedReader read = new BufferedReader(new FileReader(database))) {
            while(read.ready()){
                word.add(read.readLine());
            }
            read.close();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return word;
    }
}
