/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author Nurislam
 */
public class InFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C://Users//Nurislam//Desktop");
        File[] coll = file.listFiles();
        for(File temp: coll){
            if(temp.isFile()){
            //FileInputStream lol = new FileInputStream(file);
            //System.out.println("Размер файла: " + lol.available() + " байт(а)");
            } else System.out.println(file.isFile() + temp.getName());
        }
        try(FileInputStream fin=new FileInputStream("C://SomeDir//note.txt"))
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");
             
            int i=-1;
            while((i=fin.read())!=-1){
             
                System.out.print((char)i);
            }   
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
   }
    
}
