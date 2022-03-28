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
public class PersonClassInvariant {
    String name;
    String ssn;
    int age;
    
    private void checkAge()
    {
        assert age >= 18 && age < 150;
    }
    
            
    public void changeName(String fname)
    {
        checkAge();
        name=fname;
    }
    
  public static void main(String args[])
  {
      
      PersonClassInvariant person1=new PersonClassInvariant();
      person1.age=15;
      person1.name="dave";
      person1.changeName("David");
  }
}

