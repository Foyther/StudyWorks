/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequences;

/**
 *
 * @author Artem
 */
public class StackLink implements Sequence {
    //--------------------------------------
    private class Node{
        Object currentObject;
        Node previousObject;
      
        Node(Node pre, Object cur){
            this.currentObject = cur;
            this.previousObject = pre;
        }
    }
    //--------------------------------------
    private int size;
    private Node currentObject;
    
    public StackLink(){
        this.currentObject = new Node(null, null);
        this.size = 0;
    }
    //--------------------------------------
    public void push(Object obj) {
        this.size += 1;
        this.currentObject = new Node(this.currentObject, obj);
    }

    public Object pop() {
        if (this.size > 0){
            this.size -= 1;
            Object obj;
            obj = this.currentObject.currentObject;
            this.currentObject = this.currentObject.previousObject;
            return obj;
        }
        else {
            return null;
        }
    }

    public int size() {
        return this.size;
    }
    
}
