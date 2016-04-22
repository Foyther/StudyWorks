/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Nurislam
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        HashSet<Person> student = new HashSet<>();
        while(name.length() > 0){
            int age = sc.nextInt();
            sc.nextLine();
            if(age < 16){
                System.err.println("Error, age of student don't be smaller 16. Try again!");
                break;
            }
            Person newSt = new Person(name, age);
            student.add(newSt);
            name = sc.nextLine();
        }
        int i = 0;
        String tab = "   ";
        System.out.println("Student:");
        for(Person per: student){
            System.out.println(tab + "Student#" + i);
            System.out.println(tab + tab + "Name:" + per.getName());
            System.out.println(tab + tab + "Age:" + per.getAge());
            i++;
        }
    }
}
