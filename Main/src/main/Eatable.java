/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Nurislam
 */
public class Eatable {
    private Food[] food;
    private String[] typeOfFood = {"Cheese", "Pizza", "Lunch", "Tikka Masala", "Cornish pasty", "Scotch Egg", "Scream","Cottage Pie","Chips","Fish"};
    
    public Eatable(Food[] food){
        this.food = food;
    }
    
    public String foodName(int i){
        return typeOfFood[i];
    }
    
    
    
    public boolean check(Food[] t){
        int k = 0;
        SortedByName sort = new SortedByName();
        for(int i = 0; i < this.food.length-1; i++){
            if(sort.compare(t[i], t[i+1])> 0){
                return false;
            }
        }
        return true;
    }

}
