/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coll;

import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class Coll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new List<>();
        for(int i = 0; i < 10; i++){
            String s = "";
            for(int j = 0; j < Math.abs((int) Math.round(Math.random() * 9 + 1)); j++){
                s += (char) Math.abs((int) Math.round(Math.random() * ('z' - 'A') + 'A'));
            }
            list.push(s);
        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println('z' - 'A');
    }
    
}
