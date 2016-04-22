/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll;

import coll.List.Elem;
import java.util.AbstractCollection;
import java.util.Iterator;

/**
 *
 * @author student from 11-402
 */
public class List<T> extends AbstractCollection<Elem>{
    private int size = 0;
    
    
    @Override
    public Iterator<Elem> iterator() {
        return new ListIter(cursor, size);
    }

    @Override
    public int size() {
        return size;
    }
    
    class Elem<T>{
        public T value;
        public Elem<T> prev;
        
        public Elem(T value, Elem prev){
            this.value = value;
            this.prev = prev;
        }
        
        public Elem copy(){
            return new Elem(value, prev);
        }
        
        @Override
        public String toString(){
            return value.toString();
        }
    }
    
    
    
    private Elem<T> cursor;

    public List() {
        cursor = new Elem<>(null,null);
    }
    
    public void push(T value){
        cursor = new Elem<>(value, cursor);
        size++;
    }
    
    public void pop(){
        //
    }
    
    
}
