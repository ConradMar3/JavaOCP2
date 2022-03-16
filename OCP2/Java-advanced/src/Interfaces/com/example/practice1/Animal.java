/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.com.example.practice1;

public abstract class Animal {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    
    public abstract void eat();
    
}
