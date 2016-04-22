/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarray;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Nurislam
 */
public class StackArray {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack check = new Stack(10);
        LinkedList a = new LinkedList();
        check.push("lol");
        check.push("this");
        check.push("is");
        System.out.println(Arrays.toString(check.output()));
        
        System.out.println(check.peek(1));
        
        check.pop();
        
        
        System.out.print(Arrays.toString(check.output()));
    }
    
}
