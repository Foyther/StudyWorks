/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;

/**
 *
 * @author Nurislam
 */
public class SortedByName implements Comparator<Food>{
    
    @Override
    public int compare(Food t, Food t1) {
       return t.getName().length() - t1.getName().length();
    }
}
