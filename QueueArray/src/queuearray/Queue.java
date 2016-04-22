/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearray;

/**
 *
 * @author Nurislam
 */
public class Queue {
    private int size;
    private int head, tail; // начало // конец
    private Object[] obj;
    
    public Queue(int size){
        this.obj = new Object[size];
        this.size = size;
    }
    
    public void push(Object obj){
        this.obj[tail++] = obj;
    }
    
    public Object pop(){
        Object temp = obj[head];
        obj[head++] = null;
        return temp;
    }
    
    public Object peek(int i){
        return obj[i];
    }
    
    public Object[] output(){
        return obj;
    }
}
