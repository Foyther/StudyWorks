/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklink;

/**
 *
 * @author Nurislam
 */
public class Stack {
    private LinkList object;
    private int head = 0;
    
    public Stack(){
    LinkList object = new LinkList();    
    }
    
    public void push(Object obj){
        this.object.add(obj);
    }
    
    public Object pop(){
        return this.object.remove();
    }
    
    public Object peek(int i){
        return object.getLink(i);
    }
}
