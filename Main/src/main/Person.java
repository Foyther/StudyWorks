/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Nurislam
 */
public class Person {
    private String name;
    private double weight;
    private Food[] haveFood;
    
    public Person(String name,double weight,Food[] food){
        this.weight = weight;
        this.name = name;
        this.haveFood = food;
    }
    
    public void eat(Food[] food){
        Eatable checker = new Eatable(food);
        if(checker.check(food)){
            this.weight += food[0].getCarolofic()/1000.0;
            System.out.println("Person ate " + food[0].getName() + " and gained weight " + food[0].getCarolofic());
        }
        else System.out.println("Person can't eat, because your list isn't assorted by length!!!");
        System.out.println("________________________________\n");
    }
    
    public void personInf(){
        System.out.println("Person name is " + name);
        System.out.println("Person weight is " + weight);
    }
}
