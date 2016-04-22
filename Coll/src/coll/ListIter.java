/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll;
import coll.List.Elem;
import java.util.Iterator;
/**
 *
 * @author Nurislam
 */
public class ListIter implements Iterator<Elem>{

    private Elem o;
    private int size;
    private int state;
    
    public ListIter(Elem o , int size){
        this.o = o.copy();
        this.size = size;
        state = 0;
    }
    
    @Override
    public boolean hasNext() {
        return state < size;
    }

    @Override
    public Elem next() {
        Elem temp = o;
        o = o.prev.copy();
        state++;
        return temp;
    }
    
}
