/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Nurislam
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkList<Integer> newlist = new LinkList();
        newlist.add(1);
        newlist.add(32);
        newlist.add(829);
        System.out.println(newlist.toString());
//        int[] massive = new int[6];
//        for(int i = 0; i < massive.length; i++){
//            massive[i] = (int) Math.round(Math.random()*100);
//            System.out.print(massive[i] + " ");
//        }
//        
//        
//        for(int i = 0; i < massive.length; i++){
//            int minIndex = 0;
//            for(int j = i; j  < massive.length-1; i++){
//                if(massive[i] > massive[i+1]){
//                    minIndex = i+1;
//                }    
//            }
//            int c = massive[i]; 
//            massive[i] = massive[minIndex];
//            massive[minIndex] = c;
//            
//        }
        
        
    }
    
}
