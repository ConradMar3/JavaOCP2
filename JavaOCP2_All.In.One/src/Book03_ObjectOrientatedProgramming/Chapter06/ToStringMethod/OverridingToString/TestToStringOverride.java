package Book03_ObjectOrientatedProgramming.Chapter06.ToStringMethod.OverridingToString;

public class TestToStringOverride {
    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

class Employee3 {
    private String lastName;
    private String firstName;

    public Employee3(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString()
    {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + "]";
    }
}
