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
public class QueueLink implements Sequence {
    //--------------------------------------
    private class Node{
        Object currentObject;
        Node nextObject;
        Node(Object cur, Node next){
            this.nextObject = next;
            this.currentObject = cur;
        }
    }
    //---------------------------------
    private int size;
    private Node preFirstObject;
    private Node lastObject;
    public QueueLink(){
        
        this.lastObject = null;
        this.preFirstObject = new Node(null, this.lastObject);
        this.size = 0;
    }
    //---------------------------------
    public void push(Object obj) {
        this.size++;
        if (this.lastObject != null){
            Node last;
            last = this.lastObject;
            this.lastObject = new Node(obj, null);
            last.nextObject = this.lastObject;
        }
        else{
            this.lastObject = new Node(obj, null);
            this.preFirstObject.nextObject = this.lastObject;
        }
    }

    public Object pop() {
       if (this.size > 0){
           this.size -= 1;
           Object obj = this.preFirstObject.nextObject.currentObject;
           this.preFirstObject.nextObject = this.preFirstObject.nextObject.nextObject;
           return obj;
       }
       else{
           return null;
       }
    }

    public int size() {
        return this.size;
    }
    
}
