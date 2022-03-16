/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationDemo.com.example;


public class Employee {


    public int empId;
    public String name;
    public String ssn;
    public  double salary;

    public Employee() {
    }

    public void changeName(String newName) {
          if (newName != null) {
              this.name = newName;
          }
     }
 
     public void raiseSalary(double increase) {
         this.salary += increase;
     } 
    





}