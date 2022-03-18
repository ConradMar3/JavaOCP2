/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch.com.example.practice4.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    BiPredicate<Employee, String> eBiPred = 
      (e, s) -> e.getState().equals(s);
      
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (eBiPred.test(e, searchState)){// Use BiPredicate for test
        e.printSummary();
      }
    }
  }
}
