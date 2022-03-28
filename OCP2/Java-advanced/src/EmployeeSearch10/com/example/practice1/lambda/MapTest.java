/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSearch10.com.example.practice1.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class MapTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
   
        // Calculate sales tax
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .filter(t -> t.getProduct().equals("Widget Pro"))
            .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
            .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));
        
    }
}
