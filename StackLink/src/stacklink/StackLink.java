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
public class StackLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("string");
        stack.push("integer");
        stack.push("args");
        System.out.println(stack.pop());
        System.out.println(stack.peek(1));
    }
    
}
