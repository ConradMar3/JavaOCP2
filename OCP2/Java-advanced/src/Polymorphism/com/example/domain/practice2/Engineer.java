/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.com.example.domain.practice2;

public class Engineer extends Employee {
   

    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public void engineerMethod(){
           System.out.println("Method specific to Engineer class");
    }
}