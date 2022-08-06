package Book03_ObjectOrientatedProgramming.Chapter06.EqualsMethod.OverridingEqualsMethod;

/*
You can override the equals' method so that objects can be compared based on
their values. At the surface, you might think this is easy to do. You could be
tempted to write the equals' method for the Employee class like this:

// warning -- there are several errors in this code!
    public boolean equals(Employee emp){
        if (this.getLastName().equals(emp.getLastName())
        && this.getFirstName().equals(emp.getFirstName()))

    return true;
        else
    return false;
}
*/

/*
The basic problem with this code — and the challenge of coding a good equals
method — is that the parameter passed to the equals' method must be an Object,
not an Employee.

Java API documentation says that whenever you override the
equals' method, you must ensure that the equals' method meets five specific conditions.

1. It is reflexive. For any non-null reference value x, x.equals(x) should return true.
2. It is symmetric. For any non-null reference values x and y, x.equals(y)
   should return true if — and only if — y.equals(x) returns true.
3. It is transitive. For any non-null reference values x, y, and z, if x.equals(y)
   returns true and y.equals(z) returns true, x.equals(z) should return true.
4. It is consistent. For any non-null reference values x and y, multiple invocations of x.equals(y)
   consistently return true or consistently return false,
   provided that no information used in equals comparisons on the objects is modified.
5. For any non-null reference value x, x.equals(null) should return false.

NOTE: 4 -> The consistency rule basically means that you return consistent results.
           As long as you don’t throw a call to Math.random into the comparison,
           that shouldn't be a problem.
 */

public class TestEquality3 {
}
