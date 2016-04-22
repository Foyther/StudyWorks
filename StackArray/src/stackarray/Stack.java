/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarray;
import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class Stack {
    private int size;
    private Object[] obj;
    
    public Stack(int size){
        this.obj = new Object[size];
    }
    
    public void push(Object obj){
        this.obj[size++] = obj;
    }
    
    public Object pop(){
        this.obj[size] = null;
        return obj[size--];
        
    }
    
    public Object peek(int i){
        return obj[i];
    }
    
    public Object[] output(){
        return obj;
    }
}
