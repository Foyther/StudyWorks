/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Iterator;
import sort.LinkList.Node;

/**
 *
 * @author Nurislam
 */
public class IterLinkList<T> implements Iterator<Node>{
    private Node o;
    private int size;
    private int state;
    
    public IterLinkList(Node o , int size){
        this.o = o.copy();
        this.size = size;
        state = 0;
    }
    
    @Override
    public boolean hasNext() {
        return state < size;
    }

    @Override
    public Node next() {
        Node temp = o;
        o = o.prev.copy();
        state++;
        return temp;
    }
        
}
