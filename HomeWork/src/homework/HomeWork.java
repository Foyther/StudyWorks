/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Arrays;

/**
 *
 * @author Nurislam
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) Math.round(Math.random()*100);
        }
    
        Sorting a = new Sorting(array);
        a.bubbleSort();
        System.out.println(a.toString());
        
        System.out.println("_______________________");
        a.selectionSort();
        System.out.println(a.toString());
        
        System.out.println("_______________________");
        a.insertSort();
        System.out.println(a.toString());
        
        int[] arr = {1, 2, 3, 4};
        Sorting b = new Sorting(arr);
        System.out.println("_______________________");
        b.mergeSort();
        System.out.println(b.toString());
    }
    
}
