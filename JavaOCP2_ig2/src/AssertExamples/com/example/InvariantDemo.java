/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssertExamples.com.example;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anshenoy
 */
import java.util.Scanner;

public class InvariantDemo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 20: ");
        int value = scanner.nextInt();
        assert(value >= 0 && value <= 20) : "Invalid number: " + value;
        System.out.printf("You have entered %d\n", value);
    }
}
