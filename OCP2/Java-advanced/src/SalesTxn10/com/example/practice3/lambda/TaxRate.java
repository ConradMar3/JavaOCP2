/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesTxn10.com.example.practice3.lambda;
/**
 *
 * @author oracle
 */
public enum TaxRate {  
    CA(0.09d),
    CO(0.08d),
    MA(0.09d);
    
    private final double rate;
    
    TaxRate(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
    public static double byState(State s){
        double rate = 0.0d;
        
        switch(s){
            case CA: rate = CA.getRate(); break;
            case CO: rate = CO.getRate(); break;
            case MA: rate = MA.getRate(); break;
        }
        
        return rate;
    }
        
   
 }
