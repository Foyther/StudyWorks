/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proga;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Nurislam
 */
public class Proga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        TreeMap<String,Integer> coll = new TreeMap<>();
        System.out.println("Please, write key and value: ");
        while(i < 3){
            coll.put(sc.next(),sc.nextInt());
            i++;
        }
        
        Set<Map.Entry<String, Integer>> entry = coll.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = entry.iterator();
        
        while(iter.hasNext()){
            Map.Entry<String, Integer> temp = iter.next();
            System.out.println(temp.getKey() + " - " + temp.getValue());
        }
        
    }
    
}
    

