/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;

/**
 *
 * @author Nurislam
 */
public class Settor extends HashSet implements SortedSet{
    private Integer[] obj = new Integer[0];
    private int size = 0;
    
    public void sort(){
        for(int i = 0; i < size-1; i++){
                        
        }
    }
     
    @Override
    public Comparator comparator() {
        
        return null;
    }

    @Override
    public SortedSet subSet(Object e, Object e1) {
        return null;
    }

    @Override
    public SortedSet headSet(Object e) {
        return null;
    }

    @Override
    public SortedSet tailSet(Object e) {
        return null;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object last() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < size; i++){
            if(obj[i] != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for(Integer comp: obj){
            if(obj == o){
                return true;
            }
        }
        return false;
    }

    
    
}
