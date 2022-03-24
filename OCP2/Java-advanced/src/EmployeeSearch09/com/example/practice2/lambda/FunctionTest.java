/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch09.com.example.practice2.lambda;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    ToDoubleFunction<Employee> eFunc = 
       e -> e.getSalary() * Bonus.byRole(e.getRole());
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " + eFunc.applyAsDouble(first));
        
  }
}
