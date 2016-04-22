/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequences;

public class endlessArray<T>{
    private boolean isEmpty = true;
    private T a[];
    public void add(T obj){
        if (!isEmpty){
            Object b[] = (T[])new Object[a.length + 1];
            for(int i = 0; i < a.length; i++){
                b[i] = a[i];
            }
            b[a.length] = obj;
            a = (T[])b;
        }
        else{
            a = (T[]) new Object[1];
            a[0] = obj;
            isEmpty = false;
        }
    }
    public void remove(int i){
        if ((i >= 0) && (i < a.length)){
            a[i] = null;
        }
    }
    public T get(int i){
        if ((i >= 0) && (i < a.length)){
            return a[i];
        }
        else{
            return null;
        }
    }
    public int length(){
        if (isEmpty){
            return 0;
        }
        else{
            return a.length;
        }
    }
    public T[] getArray(){
        if (this.isEmpty){
            return (T[]) new Object[0];
        }
        else{
            return this.a;
        }
    }
}