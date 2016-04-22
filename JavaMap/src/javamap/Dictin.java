/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 *
 * @author Nurislam
 */
public class List<Key, Value> extends Dictionary<Key, Value> {
    public List[] temp;
    private Key key;
    private Value value;
    
    public List(){
        key = new Key(null,null,null);
    }

    @Override  
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(this.key == null && this.value == null){
            return true;
        }
        return false;
    }

    @Override
    public Enumeration<Key> keys() {
        return key.getKey();
    }

    @Override
    public Enumeration<Value> elements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value get(Object o) {
        
    }

    @Override
    public Value put(Key k, Value v) {
        for(int = 0; i <= this.size; i++){
            if(key.next() == null){
                Value temp = key.getValue();
                key.setValue(v);
                return temp;
            }
        }
        key = new Key<T, Value>()
        size ++;
    }

    @Override
    public Value remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
