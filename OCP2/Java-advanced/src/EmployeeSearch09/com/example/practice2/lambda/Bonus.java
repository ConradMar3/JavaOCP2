/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch09.com.example.practice2.lambda;

/**
 *
 * @author oracle
 */

public enum Bonus {
    
    STAFF(0.02),
    MANAGER(0.04),
    EXECUTIVE(0.06);
    
    private final double percent;
    
    Bonus(double percent){
        this.percent = percent;
    }
    
    public double percent(){
        return percent;
    }
   
    public static double byRole(Role r){
        
        double bonusPercent = 0.0d;
        
        switch(r){
            case EXECUTIVE: bonusPercent = EXECUTIVE.percent; break;
            case MANAGER: bonusPercent = MANAGER.percent; break;
            case STAFF: bonusPercent = STAFF.percent; break;
        }
        
        return bonusPercent;
    }
    
    
}
