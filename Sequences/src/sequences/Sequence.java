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
public interface Sequence {
    public void push(Object obj);
    public Object pop();
    public int size();
}
