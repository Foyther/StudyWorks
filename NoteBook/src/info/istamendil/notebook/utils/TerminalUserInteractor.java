/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.istamendil.notebook.utils;

import java.util.Scanner;

/**
 *
 * @author ILMAZ
 */
public class TerminalUserInteractor implements UserInteractor{
    private final Scanner sc;

    public TerminalUserInteractor() {
        sc = new Scanner(System.in);
    }

    
    @Override
    public String readCommand() throws UserInteractorReadException {
        return sc.nextLine();
    }

    @Override
    public void print(String output) throws UserInteractorWriteException {
        System.out.println(output);
    }
    
}
