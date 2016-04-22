/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artem
 */
import binarynumber.BinaryNumber;
public class Main {
    public static void main(String[] args){
        BinaryNumber a = new BinaryNumber(7);
        BinaryNumber b = new BinaryNumber(7);
        System.out.println(Integer.parseInt(a.addNumber(b).toString(), 2));
        a = new BinaryNumber(7);
        b = new BinaryNumber(8);
        System.out.println(Integer.parseInt(a.multiplyBy(b).toString(), 2));
    }
}
