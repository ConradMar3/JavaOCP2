package Book03_ObjectOrientatedProgramming.Chapter06.CloneMethod_page328.UsingCloneShallowCopy_page332;

// Example only:

/*
public class Employee implements Cloneable {
    // Fields and methods omitted...
    public Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }
}
*/