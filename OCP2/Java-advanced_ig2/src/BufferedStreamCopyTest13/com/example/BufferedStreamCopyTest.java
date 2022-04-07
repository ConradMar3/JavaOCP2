/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferedStreamCopyTest13.com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopyTest {

    public static void main(String[] args) {
        // Test the arguments - there should be two
        if (args.length < 2) {
            System.out.println("Usage: java TestNodeStreams file1 file2\nBoth file names are required.");
            System.exit(-1);
        }
        try (BufferedReader bufInput = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bufOutput = new BufferedWriter(new FileWriter(args[1]))) {
            String line = "";
            // read the first line 
            while ((line = bufInput.readLine()) != null) {
                // write the line out to the output file
                bufOutput.write(line);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}