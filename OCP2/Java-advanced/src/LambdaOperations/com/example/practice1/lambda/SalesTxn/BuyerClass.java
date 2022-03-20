/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaOperations.com.example.practice1.lambda.SalesTxn;

/**
 *
 * @author oracle
 */
public enum BuyerClass {
    BASIC(0.0d),
    SILVER(0.01d),
    GOLD(0.02d),
    PLATINUM(0.03d);
    
    private final double rate;
    
    BuyerClass(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
}