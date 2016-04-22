/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.istamendil.notebook.data;

/**
 *
 * @author Artem
 */
public class EndlessArray{
    private boolean isEmpty = true;
    private Object a[];
    public void add(Object obj){
        if (!isEmpty){
            Object b[] = new Object[a.length + 1];
            for(int i = 0; i < a.length; i++){
                b[i] = a[i];
            }
            b[a.length] = obj;
            a = b;
        }
        else{
            a = new Object[1];
            a[0] = obj;
            isEmpty = false;
        }
    }
    public void remove(int i){
        if ((i >= 0) && (i < a.length)){
            a[i] = null;
        }
    }
    public Object get(int i){
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
    public Object[] getArray(){
        if (this.isEmpty){
            return new Object[0];
        }
        else{
            return this.a;
        }
    }
}