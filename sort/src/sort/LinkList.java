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
public class LinkList<T>{
    private int size = 0;
    private Node<T> cursor;
    
    public LinkList(){
        this.cursor = new Node(null, null);
    }

     
    public boolean add(T e) {
        cursor = new Node(e, cursor);
        size++;
        return true;
    }
    
    @Override
    public String toString(){
       IterLinkList<T> iter = this.iterator();
       String s = "";
       while(iter.hasNext()){
           s = s + " " + iter.next();
       }
       return s;
    }
     
    public T set(int i, T e) {
        
        Node temp = this.get(i);
        Node temp2 = temp;
        temp = temp.copy();
        temp2.value = e;
           
        return (T) temp.value;
    }
    
    class Node<T>{
        public T value;
        public Node<T> prev;
        
        public Node(T value, Node prev){
            this.value = value;
            this.prev = prev;
        }
        
        public Node copy(){
            return new Node(value, prev);
        }
        
        public T getValue(){
            return this.value;
        }
        
         
        public String toString(){
            return value.toString();
        }
    }
    
    public IterLinkList<T> iterator() {
        return new IterLinkList<>(cursor, size);
    }

     
    public int size() {
        return size;
    }

     
    public boolean isEmpty() {
        return false;
    }

     
    public boolean contains(Object o) {
        return false;
    }


    public boolean remove(Object o) {
        return false;
    }

     

     
    public void clear() {
        
    }

     
    public Node get(int i) {
        IterLinkList<T> iter = this.iterator();
        int k = 0;
        while(iter.hasNext()){
           if(size - k == i){
               return iter.next();
           } 
           iter.next();
           k++;
        }
        return null;
    }

     
    public Node remove(int i) {
        return null;
    }

     
    public int indexOf(Object o) {
        return 0;
    }

     
    public int lastIndexOf(Object o) {
        return 0;
    }

}
