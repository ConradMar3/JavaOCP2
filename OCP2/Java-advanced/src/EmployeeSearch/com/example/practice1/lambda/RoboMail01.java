/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch.com.example.practice1.lambda;

/**
 *
 * @author Conrad
 * 
 */
public class RoboMail01 {
  
    
  public void roboMail(Employee p){
    System.out.println("Emailing: " + p.getGivenName() 
      + " " + p.getSurName() + " age " + p.getAge() 
      + " at " + p.getEmail());
  }
  
  public void roboText(Employee p) {
    System.out.println("Texting: " + p.getGivenName()
      + " " + p.getSurName() + " age " + p.getAge()
      + " at " + p.getPhone());
  }
}