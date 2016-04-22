/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nurislam
 */
public class LessonWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\Nurislam\\Desktop\\excel.csv");
        ArrayList<Integer> numOfColl = new ArrayList<>();
        String temp = sc.next();
        while(temp != " "){    
        numOfColl.add(Integer.parseInt(temp));
        temp = sc.next();
        }
        Collections.sort(numOfColl);
        try (PrintWriter os = new PrintWriter(new FileWriter(file))){
            for(int i = 0; i < numOfColl.size(); i++){
                if((i+1)%3 == 0){                    
                    os.write("\r\n"+numOfColl.get(i));
                }
                else{
                    os.write(numOfColl.get(i));
                }
                System.out.println(numOfColl.get(i));
            }
        } 
        catch(FileNotFoundException ex2) {
            ex2.printStackTrace();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        
    
    }
}
