package Book03_ObjectOrientatedProgramming.Chapter06.ObjectAsType;

public class Employee extends Person {
    /* If the Employee class has a method named
       setLastName, the following code doesn't work:

       Object emp = new Employee();
       emp.setLastName("Smith"); // error: won't compile

       Because emp is an Object, not an Employee, the compiler doesn't know about the
       setLastName method.
     */

    // Note that you could still cast the object to an Employee:

}
