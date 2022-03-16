/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulationDemo.com.example;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ManagerTest {
    
    public static void main(String args[])
    {
    Manager mgr=new Manager("admin",151, "Tom", "gh123", 8000);
    
    System.out.println("Details of Manager");
        String name = mgr.getName();
        String ssn = mgr.getSsn();
        double salary = mgr.getSalary();
        int id = mgr.getEmpId();
        String dept=mgr.getDeptName();
        System.out.println("Name= " + name +" "+ "ssn= " + ssn +" "+ "salary= " + salary+" "+ "id " + id+"Dept "+" " +dept);
        
    }
}
