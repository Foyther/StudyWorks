/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearray;

import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class QueueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue first = new Queue(6);
        first.push("ice");
        first.push("skercth");
        first.push("omg");
        first.push("nike");
        
        System.out.println(Arrays.toString(first.output()));
        first.pop();
        first.push("argument");        
        System.out.println(Arrays.toString(first.output()));
    }
    
}
