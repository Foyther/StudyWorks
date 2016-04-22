/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nod;

/**
 *
 * @author Nurislam
 */
public class Nod {
   static void inLob(int a, int b){
       if(a == 0 && b == 0){
            System.err.println("Error, two number don't equal zero");
        } else{
            if(a==0 || b==0){
                System.out.println("NOD = 0");
            } else{
                if(a > b){
                    k:for(int i = b; i >= 1; i-- ){
                        if(a%i==0 && b%i==0){
                            System.out.println("NOD = " + i);
                            break k;
                        }
                    }
                }
                if(b >= a){
                    k:for(int i = a; i >= 1; i-- ){
                        if(b%i==0 && a%i==0){
                            System.out.println("NOD = " + i);
                            break k;
                        }
                    }
                }
                }
            }
   }
   
   static void methodEvklid(int a, int b){
       if(a == 0 && b == 0){
            System.err.println("Error, two number don't equal zero");
        } else{
            if(a==0 || b==0){
                System.out.println("NOD = 0");
            } else{
                while(a!=0 && b!=0){   
                   if(a > b){
                   a = a % b;
                   } else{
                   b = b % a;
                   }
                }
                System.out.println("NOD = " + (a + b));
            }
            }
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1992,b = 32136;
        long timer = (long)System.nanoTime();
        inLob(a,b);
        System.out.println((long)System.nanoTime() - timer);
        timer = (long)System.nanoTime();
        
        methodEvklid(a,b);
        System.out.println((long)System.nanoTime() - timer);
        timer = (long)System.currentTimeMillis();
        }
    
}
