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
public class QueueArray implements Sequence{
    private endlessArray<Object> queue;
    private int begin;
    private int end;
    public QueueArray(){
        this.queue = new endlessArray<>();
        this.begin = 0;
        this.end = -1;
    }
    public void push(Object obj){
        this.end += 1;
        this.queue.add(obj);
    }
    public Object pop(){
        if (this.begin <= this.end){
            Object obj = this.queue.get(this.begin);
            this.begin += 1;
            return obj;
        }
        else{
            return null;
        }
    }
    public int size(){
        return this.end - this.begin + 1;
    }
}
