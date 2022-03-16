/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractBanking.com.example.practice1;



public class SavingsAccount extends Account{
     Double rateofinterest=0.06;

    public SavingsAccount(double balance) {
        super(balance);
    }

    
    
 
    

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance ) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    
     @Override
     public void  deposit(double amount) {
       balance += amount;
       balance +=balance * rateofinterest;
       
        }
    
    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
}
