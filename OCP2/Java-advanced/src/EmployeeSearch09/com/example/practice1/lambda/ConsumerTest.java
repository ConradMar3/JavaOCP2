/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch09.com.example.practice1.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Consumer<Employee> eCons = 
      e -> System.out.println(
        "Name: " + e.getSurName() + "  Role: " 
        + e.getRole() + "  Salary: " + e.getSalary()
      );
    
    System.out.println("=== First Salary");
    eCons.accept(first);
    
  }
}
