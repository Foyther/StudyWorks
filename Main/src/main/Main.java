/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Food[] loool = new Food[10];
        Eatable temp = new Eatable(loool);
        
        
        for(int i = 0; i < loool.length; i++){
            loool[i] = new Food(temp.foodName(i), (int)Math.round(Math.random()*3000+100));
        }
        
        toStr(loool);
        for(int k = 0; k < loool.length-1; k++)
        for(int i = 0; i < loool.length-1; i++){
            if(loool[i].compareTo(loool[i+1])>= 0){
                Food b = loool[i];
                loool[i] = loool[i+1];
                loool[i+1] = b;
            }
        }
        
        toStr(loool);
        
        Person man = new Person("Vasya", 69.0, loool);
        man.personInf();
        man.eat(loool);
        
        Arrays.sort(loool, new SortedByName());
        toStr(loool);
        
        
        Person woman = new Person("Masha", 49.0, loool);
        woman.personInf();
        woman.eat(loool);
        woman.eat(loool);
        
        toStr(loool);
    }
    
    public static void toStr(Food[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i].toString());
        }
        System.out.println("__________________________________\n");
    }
}