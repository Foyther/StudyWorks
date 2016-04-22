/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;
import java.io.File;
import java.util.Arrays;

class TreeOutput {
    public void printTree(File file){
        print(file, " ");
    }
    
    private void print(File file, String prev){
        if(file.isDirectory()){
                prev = " " + prev;
                File[] temp = file.listFiles();
                if(temp != null){
                    Arrays.sort(temp);
                    for(File obj: temp){
                        System.out.println(prev + "|_" + obj.getName());
                        this.print(obj, prev);
                    }
                }
        }
    }
}