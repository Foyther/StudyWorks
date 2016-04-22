/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarynumbertest;

import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class BinaryNumberTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryNumber num = new BinaryNumber(10);
        BinaryNumber num1 = num.multiplyBy(num);
        System.out.println(num1);
    }
    
}
