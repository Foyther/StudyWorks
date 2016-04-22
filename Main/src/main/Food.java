/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;
import java.util.TreeSet;

public class Food implements Comparable<Food> {
    private String name;
    private double carolofic;
   
    public Food(String name, double carolofic){
       this.name = name;
       this.carolofic = carolofic;
    }
    
  
    @Override
    public int compareTo(Food obj){
        return Double.compare(this.carolofic, obj.getCarolofic());
    }
   
    public String getName(){
        return name;
    }
    
    public double getCarolofic(){
        return carolofic;
    }
    
    public String toString(){
        return this.getName()+ " " + this.getCarolofic();
    }

    
}
