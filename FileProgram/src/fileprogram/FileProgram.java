/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprogram;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Nurislam
 */
public class FileProgram {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        TreeOutput fileTree = new TreeOutput();
        File file = new File(path);
        fileTree.printTree(file);
    }
}
