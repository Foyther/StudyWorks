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
public class StackArray implements Sequence {
    private endlessArray<Object> stack;
    private int end;
    public StackArray(){
        this.stack = new endlessArray<>();
        this.end = -1;
    }
    public void push(Object obj){
        this.end += 1;
        this.stack.add(obj);
    }
    public Object pop(){
        if (this.end >= 0){
            Object obj = this.stack.get(this.end);
            this.end -= 1;
            return obj;
        }
        else{
            return null;
        }
    }
    public int size(){
        return this.end + 1;
    }
}
