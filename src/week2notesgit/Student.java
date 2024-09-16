/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2notesgit;

/**
 *
 * @author James
 */
public class Student {
    
    // Encapsulation princpile restrict access from other classes 
    // declare all the variables are private and get them though getter setter 
    private int id;
    private int age;
    private String name;
    
    
    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    
    
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
}

    
}
