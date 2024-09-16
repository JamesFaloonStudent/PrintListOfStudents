/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2notesgit;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author James
 */
public class Week2NotesGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // user Constructors to create student variables 
        Student student1 = new Student(1, 18, "James ");
        Student student2 = new Student(1, 16, "Sarah");
        Student student3= new Student(1, 51, "Scott");
        Student student4 = new Student(1, 52, "Charlene ");
        
        // create static list of students 
        Student[] students = new Student[4];
        
        // set each index to a unique student 
        students[0] =(student1);
        students[1] = (student2);
        students[2] = (student3);
        students[3] = (student4);
        
        
        // for each student in students print there name age and id 
        for (Student student : students) {
            System.out.println("Student Id: " + student.getId() + " Age: " + student.getAge() + " Name: " + student.getName());
        }
        // TODO code application logic here
   
    }
    
    
    
}
