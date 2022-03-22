/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch.com.example.lambda.practice4;

import java.util.List;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
pl.stream()
        .filter(p -> p.getAge() < 65)
        .filter(p -> p.getDept().equals("ENG"))
        .filter(p -> p.getGender().equals(Gender.MALE))
        .forEach(p -> {robo.roboMail(p);robo.roboText(p);});
        
    
    // Mail mail, Eng employees < 65

  }
}
