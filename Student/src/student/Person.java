/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Objects;

/**
 *
 * @author Nurislam
 */
public class Person {
    private int age;
    private String name;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
       
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
} 
