/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesTxn10.com.example.practice3.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .forEach(radioReport);
        
        // Print out the total number of transactions
        System.out.print("Total Transactions: ");
        long tCount = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .count();
        System.out.println(tCount);
        
        
        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");
        Optional<SalesTxn> tLarge = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .max(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(tLarge.isPresent()){ radioReport.accept(tLarge.get());}
        
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");
        Optional<SalesTxn> tSmall = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .min(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(tSmall.isPresent()){ radioReport.accept(tSmall.get());}                 
    }
}
